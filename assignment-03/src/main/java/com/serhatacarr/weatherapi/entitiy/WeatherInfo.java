package com.serhatacarr.weatherapi.entitiy;

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

public class WeatherInfo {
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private String description;
    private ArrayList<DayInfo> days;
}
