package io.pivotal.pal.tracker.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import java.util.TimeZone;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({
        "io.pivotal.pal.tracker.accounts",
        "io.pivotal.pal.tracker.restsupport",
        "io.pivotal.pal.tracker.projects",
        "io.pivotal.pal.tracker.users",
        "io.pivotal.pal.tracker.registration"
})
@EnableEurekaClient
public class App_1 {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(App_1.class, args);
    }
}