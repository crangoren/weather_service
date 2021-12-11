package task.weather_service.services;

import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;

@Service
public class HistoryService {

    public String getTemp() throws IOException {
        URL url = new URL("https://yandex.ru/?utm_source=google&utm_medium=search&utm_campaign=brand_search_msk%3Aspb&utm_term=yandex&gclid=CjwKCAiAksyNBhAPEiwAlDBeLD6DBZ3K2NEm2GbpAWTh1_lAaJ9dNLgsUtLajAeSMmZSQTYHLbzh5RoChuUQAvD_BwE&campaignid=1679697480&adgroupid=65697694936&creative=438922846234&keyword=yandex");
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
        String weatherValue = content.substring(content.indexOf("temp'>") +6, content.lastIndexOf("°<"));
        return weatherValue;
    }

}
