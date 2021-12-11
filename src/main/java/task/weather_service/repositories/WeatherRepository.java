package task.weather_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import task.weather_service.resources.Weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Date> {
//    String findByDate(Date curDate);


    @Query(value = "select weather_value from weather_history where weather_date = :curDate", nativeQuery = true)
    String getCurTemp(String curDate);

//    @Query(value = "insert into w Weather w")
//    String saveWeather(Weather weather);


}
