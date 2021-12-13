package task.weather_service.resources;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "weather_history")
public class Weather {

    @Id
    @Column(name = "weather_date")
    private String weatherDate;

    @Column(name = "weather_value")
    private String weatherValue;

    public Weather(String weatherDate, String weatherValue) {
        this.weatherDate = weatherDate;
        this.weatherValue = weatherValue;
    }

    public Weather() {

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
