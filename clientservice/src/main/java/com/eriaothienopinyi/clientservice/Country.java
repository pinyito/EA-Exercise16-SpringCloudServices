package com.eriaothienopinyi.clientservice;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Country {
    private Integer id;
    private String name;
    private LocalDateTime lastUpdate;
}
