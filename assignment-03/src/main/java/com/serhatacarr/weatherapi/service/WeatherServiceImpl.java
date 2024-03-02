package com.serhatacarr.weatherapi.service;

import com.serhatacarr.weatherapi.client.WeatherClient;
import com.serhatacarr.weatherapi.dto.Weather;
import com.serhatacarr.weatherapi.entitiy.Range;
import com.serhatacarr.weatherapi.entitiy.WeatherInfo;
import com.serhatacarr.weatherapi.exception.WeatherInfoAccessException;
import com.serhatacarr.weatherapi.mapper.WeatherInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherClient weatherClient;
    private final WeatherInfoMapper weatherInfoMapper;

    @Override
    public WeatherInfo getWeatherInfo(String city, String country, Range range) {

        StringBuilder builder = new StringBuilder();

        try {
            LocalDate startDate = LocalDate.now();
            builder.append(startDate);
            if (range.equals(Range.WEEKLY)) {
                builder.append("/").append(startDate.plusDays(6));
            }

            ResponseEntity<Weather> weather = weatherClient.getData(city, country, String.valueOf(builder));

            return weatherInfoMapper.convert(weather.getBody());

        } catch (Exception e) {
            throw new WeatherInfoAccessException("Unexpected error occurred while accessing weather info!");
        }
    }
}