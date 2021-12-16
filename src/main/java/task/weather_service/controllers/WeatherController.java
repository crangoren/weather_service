package task.weather_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.weather_service.dto.WeatherDto;
import task.weather_service.resources.Weather;
import task.weather_service.services.WeatherService;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public String showWeather() throws IOException {
        Date curDate = new Date();
        return weatherService.showWeather();
    }

    @PostMapping
    public String newWeather(@RequestBody WeatherDto weatherDto) throws IOException {
        WeatherDto weatherdto = new WeatherDto();
        weatherdto.setWeatherDate(weatherDto.getWeatherDate());
        weatherdto.setWeatherValue(weatherDto.getWeatherValue());
        weatherService.saveWeather(weatherdto);
        return weatherService.showWeather();
    }

}
