package com.example.sampleapi.controller;

import com.example.sampleapi.dto.SampleMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String sample() {
        return "Hello World";
    }

    @GetMapping("/sample/api")
    public ResponseEntity<SampleMessage> sampleApi() {
        SampleMessage sampleMessage = new SampleMessage();
        sampleMessage.setId(100);
        sampleMessage.setMessage("Hello World");

        return new ResponseEntity<>(sampleMessage,HttpStatus.OK);
    }
}
