package com.eriaothienopinyi.clientservice.feignutil;

import com.eriaothienopinyi.clientservice.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="countryServer", url = "http://localhost:8084")
public interface FeignServiceUtil {
    @GetMapping("/countries")
    public List<Country> getCountries();
}
