package task.weather_service.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class WeatherDto {

    private String weatherDate;
    private String weatherValue;

    public WeatherDto(String weatherDate, String weatherValue) {
        this.weatherDate = weatherDate;
        this.weatherValue = weatherValue;
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
