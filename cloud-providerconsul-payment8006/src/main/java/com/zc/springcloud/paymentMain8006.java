package com.zc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * user:zhaocong
 * time:2021年1月15日 下午2点19
 */

@SpringBootApplication
@EnableDiscoveryClient
public class paymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8006.class,args);
    }
}
