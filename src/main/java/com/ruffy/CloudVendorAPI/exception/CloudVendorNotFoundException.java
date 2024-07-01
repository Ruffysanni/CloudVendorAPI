package com.ruffy.CloudVendorAPI.exception;

public class CloudVendorNotFoundException extends RuntimeException{
    public CloudVendorNotFoundException() {
    }

    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
