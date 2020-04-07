package com.beeu.userservice.utils;

public class InternalKeyValidator {

    public static void validate(String key) {
        if(!"beeu-dev".equalsIgnoreCase(key)) {
            throw new IllegalArgumentException("key is invalid!");
        }
    }
}
