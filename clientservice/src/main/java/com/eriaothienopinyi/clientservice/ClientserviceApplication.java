package com.eriaothienopinyi.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientserviceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ClientserviceApplication.class, args);
		CountryServiceClient client = context.getBean(CountryServiceClient.class);
		List<Country> countriesList = client.getAllCountries();
		countriesList.forEach(
				System.out::println
		);

	}
}
