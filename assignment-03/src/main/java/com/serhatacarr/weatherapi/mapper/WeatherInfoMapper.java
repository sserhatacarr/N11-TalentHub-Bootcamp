package com.serhatacarr.weatherapi.mapper;

import com.serhatacarr.weatherapi.dto.Day;
import com.serhatacarr.weatherapi.dto.Weather;
import com.serhatacarr.weatherapi.entitiy.DayInfo;
import com.serhatacarr.weatherapi.entitiy.WeatherInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @author Serhat Acar
 */


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WeatherInfoMapper {


    WeatherInfo convert(Weather weather);
    List<DayInfo> convertToDayInfos(List<Day> days);


}

