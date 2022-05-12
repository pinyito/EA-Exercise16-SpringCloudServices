package com.eriaothienopinyi.exercise16springcloudservices.Repository;

import com.eriaothienopinyi.exercise16springcloudservices.Domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
