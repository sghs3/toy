package com.project.toy.biz.sample.controller;


import com.project.toy.biz.sample.domain.SampleVO;
import com.project.toy.biz.sample.service.SampleService;
import com.project.toy.biz.sample.service.SampleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RequiredArgsConstructor
@RestController
public class SampleController {
    private final SampleService sampleService;

    @GetMapping("/")
    public ResponseEntity<Object> redirect() throws URISyntaxException {
        HttpHeaders httpHeader = new HttpHeaders();
        httpHeader.setLocation(new URI("http://localhost:8080/hello"));
        return new ResponseEntity<>(httpHeader, HttpStatus.PERMANENT_REDIRECT);
    }

    @GetMapping("/hello")
    public String sample() throws URISyntaxException {
        return sampleService.printSampleInfo();
    }
}
