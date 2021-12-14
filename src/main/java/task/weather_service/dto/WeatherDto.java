package task.weather_service.dto;

import task.weather_service.resources.Weather;

import javax.persistence.Column;
import javax.persistence.Id;

public class WeatherDto {

    private String weatherDate;
    private String weatherValue;

    public WeatherDto(Weather weather) {
        this.weatherDate = weather.getWeatherDate();
        this.weatherValue = weather.getWeatherValue();
    }

    public WeatherDto() {
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(String weatherDate) {
        this.weatherDate = weatherDate;
    }

    public String getWeatherValue() {
        return weatherValue;
    }

    public void setWeatherValue(String weatherValue) {
        this.weatherValue = weatherValue;
    }
}
