package com.eriaothienopinyi.exercise16springcloudservices.Controller;

import com.eriaothienopinyi.exercise16springcloudservices.Domain.City;
import com.eriaothienopinyi.exercise16springcloudservices.Domain.Country;
import com.eriaothienopinyi.exercise16springcloudservices.Service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    AppService appService;

    @GetMapping("/countries")
    public List<Country> findCountries(){
        return appService.findAllCountries();
    }

    @GetMapping("/cities")
    public List<City> findCities(){
        return appService.findAllCities();
    }

}
