package com.MaciejPrzezwicki.DynamicShootingApp.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource not found");
    }
}
