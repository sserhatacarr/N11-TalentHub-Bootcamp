package com.serhatacarr.weatherapi.service;

import com.serhatacarr.weatherapi.entitiy.Range;
import com.serhatacarr.weatherapi.entitiy.WeatherInfo;

/**
 * @author Serhat Acar
 */

public interface WeatherService {
    WeatherInfo getWeatherInfo(String city, String country, Range range);
}
