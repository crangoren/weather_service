package task.weather_service.services;

import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;

@Service
public class HistoryService {
/**
 * В требованиях к тестовому было указано стучаться именно на яндекс, без сторонних библиотек.
 * сделал так. Как вариант можно было бы через их weather api на тестовом аккаунте и получить стразу JSON объект,
 * либо с использованием jsoap, но так же искать url с бэка.
 * **/

    public String getTemp() throws IOException {
        URL url = new URL("https://yandex.ru");
        InputStream in = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringBuilder buf = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line != null) {
                buf.append(line).append('\n');
            } else {
                break;
            }
        }
        String content = buf.toString();
        String weatherValue = content.substring(content.indexOf("__temp") +8, content.lastIndexOf("°</div>"));
        return weatherValue;
    }

}
