package task.weather_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.weather_service.repositories.WeatherRepository;
import task.weather_service.resources.Weather;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    private final HistoryService historyService;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository, HistoryService historyService) {
        this.weatherRepository = weatherRepository;
        this.historyService = historyService;
    }

    public String showWeather() throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = sdf.format(date);
        String weatherValue = weatherRepository.getCurTemp(curDate);
        if (weatherValue != null) {
            return weatherValue;
        } else {
            String tempFromSite = historyService.getTemp();
            Weather weather = new Weather(curDate, tempFromSite);
            weatherRepository.save(weather);
            return tempFromSite;
        }
    }

    public String saveWeather(Weather weather){
        weatherRepository.save(weather);
        return weather.getWeatherValue();
    }

}
