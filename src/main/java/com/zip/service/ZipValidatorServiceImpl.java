package com.zip.service;

import org.springframework.stereotype.Service;

@Service
public class ZipValidatorServiceImpl implements ZipValidatorService {
    
    private static final String ZIP_REGEX = "\\d{5}(-\\d{4})?";

    @Override
    public Boolean isValid(String zipCode) {
        return zipCode.matches(ZIP_REGEX);
    }

}
