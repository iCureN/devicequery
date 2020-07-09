package com.javaboy.devicequery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.javaboy.devicequery.mapper")
public class DevicequeryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevicequeryApplication.class, args);
    }

}
