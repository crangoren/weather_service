package task.weather_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import task.weather_service.resources.Weather;
import task.weather_service.services.WeatherService;
import java.io.IOException;
import java.util.Date;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String showWeather() throws IOException {
        Date curDate = new Date();
        return weatherService.showWeather();
    }

    @PostMapping("/weather")
    public String newWeather(Weather weather){
        return weatherService.saveWeather(weather);
    }

}
