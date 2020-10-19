package App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Starter1 {
    public static void main(String[] args) {
        SpringApplication.run(Starter1.class, args);
    }
}
