package com.wn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient//开启服务消费，可以连接多个服务
@EnableZuulProxy
@EnableEurekaClient
public class ServerZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }
}
