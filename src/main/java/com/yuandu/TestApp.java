package com.yuandu;

import com.yuandu.test.mapperscan.MapperScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Configuration
@MapperScanner(basePackages = { "${mybatis.mapperLocations}"})
public class TestApp {

    public static void main(String[] args){
        SpringApplication application = new SpringApplication(TestApp.class);
        Map<String, Object> defaultProperties = new HashMap<>();
        //defaultProperties.put("db.mybatis.mapperScanner.basePackage", "com.yuandu.user.dao.mapper");
        application.setDefaultProperties(defaultProperties);
        application.setWebEnvironment(true);
        application.run(args);
    }
}
