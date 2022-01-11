package task.weather_service.converters;

import org.springframework.stereotype.Component;
import task.weather_service.dto.WeatherDto;
import task.weather_service.entities.Weather;

@Component
public class WeatherConverter {
    public Weather dtoToEntity(WeatherDto weatherDto) {
        return new Weather(weatherDto.getWeatherDate(), weatherDto.getWeatherValue());
    }

    public WeatherDto entityToDto(Weather weather) {
        return new WeatherDto(weather.getWeatherDate(), weather.getWeatherValue());
    }
}
