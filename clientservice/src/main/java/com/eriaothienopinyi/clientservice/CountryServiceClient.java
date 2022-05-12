package com.eriaothienopinyi.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryServiceClient {
    @Autowired
    private RestTemplate restTemplate;
    private String serverUrl = "http://localhost:8084/countries";

    public List<Country> findAll(){
        Country[] countries = restTemplate.getForObject(
                serverUrl, Country[].class
        );
        return Arrays.asList(countries);
    }
}
