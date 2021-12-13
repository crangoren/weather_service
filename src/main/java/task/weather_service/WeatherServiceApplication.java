package task.weather_service;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import task.weather_service.utils.SessionFactoryUtils;

@SpringBootApplication
public class WeatherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceApplication.class, args);
		SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
		sessionFactoryUtils.init();

	}
}
