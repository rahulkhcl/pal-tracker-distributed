package io.pivotal.pal.tracker.zipkIn;

/**
 * Created by Rahulka on 25-07-2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableZipkinStreamServer
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}