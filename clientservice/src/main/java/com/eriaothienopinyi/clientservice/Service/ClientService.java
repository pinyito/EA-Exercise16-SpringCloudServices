package com.eriaothienopinyi.clientservice.Service;

import com.eriaothienopinyi.clientservice.Model.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="Server")
public interface ClientService {
    @GetMapping("/countries")
    public List<Country> getCountries();
}
