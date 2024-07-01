package com.ruffy.CloudVendorAPI.controller;

import com.ruffy.CloudVendorAPI.model.CloudVendor;
import com.ruffy.CloudVendorAPI.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    @Autowired
    private CloudVendorService cloudVendorService;

//    public CloudVendorController(CloudVendorService cloudVendorService) {
//        this.cloudVendorService = cloudVendorService;
//    }

    @GetMapping("/{vendorId}")
    public String getCloudVendorById(@PathVariable int vendorId){
        cloudVendorService.getById(vendorId);
        return "Vendor with id: " + vendorId + " returned successfully.";
    }

    @GetMapping("/all-cloudvendors")
    public String getAllCloudVendors(){
        cloudVendorService.getAllVendors();
        return "All vendors successfully fetched!";
    }
    @PostMapping("/vendor")
    public String createNewCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createNewCloudVendor(cloudVendor);
        return "New vendor successfully created!";
    }

    @PutMapping("/update/{vendorId}")
    public String updateCloudVendor(@PathVariable int vendorId, @RequestBody CloudVendor updateVendor){
        cloudVendorService.updateVendor(vendorId, updateVendor);
        return "Vendor successfully updated!";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendor(@PathVariable int vendorId){
        cloudVendorService.deleteVendor(vendorId);
        return "Vendor successfully deleted!";
    }
}
