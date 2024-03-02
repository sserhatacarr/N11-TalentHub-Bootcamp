package com.serhatacarr.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author Serhat Acar
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private int queryCost;
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private double tzoffset;
    private String description;
    private ArrayList<Day> days;
    @JsonIgnore
    private ArrayList<Object> alerts;
    private Object stations;
}
