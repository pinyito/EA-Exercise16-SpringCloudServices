package com.eriaothienopinyi.exercise16springcloudservices.Domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Country {
    @Id
    @Column(name="country_id")
    private Integer id;
    @Column(name="country")
    private String name;
    @Column(name="last_update")
    private LocalDateTime lastUpdate;
}
