package com.serhatacarr.weatherapi.client;

import com.serhatacarr.weatherapi.dto.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "weather", url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/")
public interface WeatherClient {

    @Value("${visualcrossing.api.key}")
    String API_KEY = null;


    @GetMapping("/{city},{countryCode}/{startEndDate}/?key=${visualcrossing.api.key}")
    ResponseEntity<Weather> getData(@PathVariable(value = "city") String city,
                                    @PathVariable(value = "countryCode") String countryCode,
                                    @PathVariable String startEndDate);
}
