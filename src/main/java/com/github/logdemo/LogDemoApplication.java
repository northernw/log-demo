package com.github.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogDemoApplication.class, args);

        Logger log = LoggerFactory.getLogger(LogDemoApplication.class);
        log.info("info!");
        log.warn("warn!");
        log.error("error!");
    }

}
