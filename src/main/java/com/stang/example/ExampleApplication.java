package com.stang.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mcc
 * @version V1.0
 * @Title: ExampleApplication
 * @Package com.stang.example
 * @Description:
 * @date 7/20/18
 */
@MapperScan(value = "com.stang.example.dao")
@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
