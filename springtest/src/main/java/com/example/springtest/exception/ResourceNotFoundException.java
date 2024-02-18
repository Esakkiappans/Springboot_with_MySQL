package com.example.springtest.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String error){
        super(error);
    }
}
