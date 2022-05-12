package com.eriaothienopinyi.exercise16springcloudservices.Domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class City {
    @Id
    @Column(name="city_id")
    private Integer id;
    @Column(name="city")
    private String name;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
    @Column(name="last_update")
    private LocalDateTime lastUpdate;
}
