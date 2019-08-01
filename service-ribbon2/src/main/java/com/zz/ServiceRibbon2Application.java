package com.zz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//开启服务消费，可以连接多个服务
public class ServiceRibbon2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbon2Application.class, args);
    }

    @Bean
    @LoadBalanced//开启负载均衡功能
    public RestTemplate restTemplate(){//RestTemplate负责调用服务
        return  new RestTemplate();
    }

}
