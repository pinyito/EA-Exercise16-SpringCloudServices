package com.eriaothienopinyi.exercise16springcloudservices.Repository;

import com.eriaothienopinyi.exercise16springcloudservices.Domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
