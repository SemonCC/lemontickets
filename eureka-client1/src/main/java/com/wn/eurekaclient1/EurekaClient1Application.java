package com.wn.eurekaclient1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wn.eurekaclient1.mapper")
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }

}
