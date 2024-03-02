package com.serhatacarr.weatherapi.dto;

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
public class Hour {
    private String datetime;
    private int datetimeEpoch;
    private double temp;
    private double feelslike;
    private double humidity;
    private double dew;
    private double precip;
    private double precipprob;
    private double snow;
    private double snowdepth;
    private ArrayList<String> preciptype;
    private double windgust;
    private double windspeed;
    private double winddir;
    private double pressure;
    private double visibility;
    private double cloudcover;
    private double solarradiation;
    private double solarenergy;
    private double uvindex;
    private double severerisk;
    private String conditions;
    private String icon;
    private ArrayList<String> stations;
    private String source;
}
