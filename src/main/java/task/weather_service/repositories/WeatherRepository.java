package task.weather_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import task.weather_service.entities.Weather;
import java.util.Date;


@Repository
public interface WeatherRepository extends JpaRepository<Weather, Date> {

    @Query(value = "select weather_value  from weather_history where weather_date = :cur_date", nativeQuery = true)
    String getCurTemp(@Param("cur_date") String curDate);

}
