package com.eriaothienopinyi.clientservice.Controller;

import com.eriaothienopinyi.clientservice.Model.Country;
import com.eriaothienopinyi.clientservice.Service.ClientService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {
    @Value("${server-service.service-name}")
    private String serverServiceName;

    @Value("${server-service.username}")
    private String username;

    @Value("${server-service.password}")
    private String password;

    @Autowired
    private ClientService clientService;

    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/countries")
//    public List<Country> getAllCountriesOriginal(){
//        return clientService.getCountries();
//    }

    private List<Country> countryListCache = new ArrayList<>();
    @GetMapping("/countries")
    @HystrixCommand(fallbackMethod = "defaultGetAllCountries")
    public List<Country> getAllCountries() {
        String url = "http://localhost:8084" + "/countries";
        countryListCache = Arrays.asList(restTemplate.exchange(url, HttpMethod.GET, createHttpEntity(), Country[].class).getBody());
        return countryListCache;
    }

    public List<Country> defaultGetAllCountries() {
        return countryListCache;
    }

    private HttpEntity<Object> createHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(username, password);

        return new HttpEntity<>(headers);
    }

//    private String lookupUrlFor(String appName) {
//        InstanceInfo instanceInfo = .getNextServerFromEureka(appName, false);
//        return instanceInfo.getHomePageUrl();
//    }

}
