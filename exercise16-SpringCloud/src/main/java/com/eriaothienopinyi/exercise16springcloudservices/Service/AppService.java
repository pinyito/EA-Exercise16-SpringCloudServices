package com.eriaothienopinyi.exercise16springcloudservices.Service;

import com.eriaothienopinyi.exercise16springcloudservices.Domain.City;
import com.eriaothienopinyi.exercise16springcloudservices.Domain.Country;

import java.util.List;

public interface AppService {
    public List<Country> findAllCountries();
    public List<City> findAllCities();
}
