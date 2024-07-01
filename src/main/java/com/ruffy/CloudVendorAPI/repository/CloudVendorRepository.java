package com.ruffy.CloudVendorAPI.repository;

import com.ruffy.CloudVendorAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {
}
