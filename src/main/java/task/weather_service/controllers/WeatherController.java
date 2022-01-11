package task.weather_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.weather_service.converters.WeatherConverter;
import task.weather_service.dto.WeatherDto;
import task.weather_service.entities.Weather;
import task.weather_service.services.WeatherService;
import java.io.IOException;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;
    private final WeatherConverter weatherConverter;

    @Autowired
    public WeatherController(WeatherService weatherService, WeatherConverter weatherConverter) {
        this.weatherService = weatherService;
        this.weatherConverter = weatherConverter;
    }


    @GetMapping
    public WeatherDto showWeather() throws IOException {
        return weatherConverter.entityToDto(weatherService.getWeather());
    }

}
