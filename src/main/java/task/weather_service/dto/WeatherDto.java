package task.weather_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task.weather_service.entities.Weather;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {

    private String weatherDate;
    private String weatherValue;

}
