package com.acode.security;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer location_id;
    private String county;
    private String sub_county;
    private String latitude;
    private String longitude;
}
