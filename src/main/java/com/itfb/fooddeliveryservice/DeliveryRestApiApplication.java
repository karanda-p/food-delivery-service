package com.itfb.fooddeliveryservice;

import com.itfb.fooddeliveryservice.component.LdapProperties;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties({
        LdapProperties.class
})
@EnableFeignClients
@EnableProcessApplication
public class DeliveryRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryRestApiApplication.class, args);
    }

}
