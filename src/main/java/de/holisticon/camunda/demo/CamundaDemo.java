package de.holisticon.camunda.demo;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaDemo {
    public static void main(String[] args) {
        SpringApplication.run(CamundaDemo.class, args);
    }
}
