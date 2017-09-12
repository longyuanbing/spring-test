package com.yuandu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.yuandu")
public class TestApp {
    public static void main(String[] args){
        SpringApplication.run(TestApp.class, args);
    }
}
