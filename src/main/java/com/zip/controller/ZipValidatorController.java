package com.zip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zip.service.ZipValidatorService;

@RestController
@RequestMapping("/zip")
public class ZipValidatorController {

    @Autowired
    private ZipValidatorService zipValidatorService;
    
    @Autowired
    private ServletWebServerApplicationContext server;

    @GetMapping("/{zipCode}")
    public ResponseEntity<Boolean> zipValidator(@PathVariable("zipCode") String zipCode) {

        try {
            Boolean isValidZipCode = zipValidatorService.isValid(zipCode);
            return new ResponseEntity<>(isValidZipCode, HttpStatus.OK);
        } catch (RuntimeException runtimeException) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/port")
    public String serverPort() {
        return String.valueOf(server.getWebServer().getPort());
    }

}
