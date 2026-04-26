package com.mybatisgx.example.spring.boot;

import com.mybatisgx.boot.MybatisgxScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;

@MybatisgxScan(
        entityBasePackages = "com.mybatisgx.example.spring.boot.entity",
        daoBasePackages = "com.mybatisgx.example.spring.boot.dao",
        annotationClass = Repository.class
)
@SpringBootApplication(scanBasePackages = {"com.mybatisgx.example.spring.boot"})
public class ExampleBoot2Application {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(ExampleBoot2Application.class, args);
    }
}
