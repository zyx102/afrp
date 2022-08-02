package com.afrp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDubbo
@SpringBootApplication
@ComponentScan(basePackages = {"com.afrp.server.**"})
public class AppServer {

    public static void main(String[] args) {

        SpringApplication.run(AppServer.class);

    }
}
