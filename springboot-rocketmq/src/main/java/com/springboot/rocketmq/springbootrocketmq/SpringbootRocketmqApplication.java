package com.springboot.rocketmq.springbootrocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.rocketmq.springbootrocketmq.one")
//@ComponentScan(basePackages = "com.springboot.rocketmq.springbootrocketmq.two")
public class SpringbootRocketmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRocketmqApplication.class, args);
    }

}
