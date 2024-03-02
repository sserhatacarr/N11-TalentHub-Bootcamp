package com.serhatacarr.weatherapi.controller;

import com.serhatacarr.weatherapi.entitiy.Range;
import com.serhatacarr.weatherapi.entitiy.WeatherInfo;
import com.serhatacarr.weatherapi.service.WeatherService;
import com.serhatacarr.weatherapi.util.ValidCountryCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Serhat Acar
 */
@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
@Validated
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<WeatherInfo> getWeatherInfo(@RequestParam String city,
                                                      @RequestParam @ValidCountryCode String country,
                                                      @RequestParam Range range
    ) {
        return new ResponseEntity<>(weatherService.getWeatherInfo(city,country,range), HttpStatus.OK);
    }

}
