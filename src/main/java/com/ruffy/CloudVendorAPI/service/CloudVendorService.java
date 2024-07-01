package com.ruffy.CloudVendorAPI.service;


import com.ruffy.CloudVendorAPI.exception.CloudVendorNotFoundException;
import com.ruffy.CloudVendorAPI.model.CloudVendor;
import com.ruffy.CloudVendorAPI.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorService {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;

//    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
//        this.cloudVendorRepository = cloudVendorRepository;
//    }

    public CloudVendor getById(int vendorId){

        if(cloudVendorRepository.findById(vendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested vendor does not exist");
        }
        return cloudVendorRepository.findById(vendorId).get();
    }

    public List<CloudVendor> getAllVendors(){
        return cloudVendorRepository.findAll();
    }

    public CloudVendor updateVendor(int vendorId, CloudVendor newVendor){
        CloudVendor cloudVendor1 = cloudVendorRepository.findById(vendorId).get();
        cloudVendor1.setVendorAddress(newVendor.getVendorAddress());
        cloudVendor1.setVendorName(newVendor.getVendorName());
        cloudVendor1.setVendorPhoneNumber(newVendor.getVendorPhoneNumber());
        return cloudVendorRepository.save(cloudVendor1);
    }

    public CloudVendor createNewCloudVendor(CloudVendor cloudVendor){

        return cloudVendorRepository.save(cloudVendor);
    }

    public void deleteVendor(int cloudVendorId){
      cloudVendorRepository.deleteById(cloudVendorId);
    }

}
