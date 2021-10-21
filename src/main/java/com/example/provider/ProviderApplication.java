package com.example.provider;


import com.example.service.ProductService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan
public class ProviderApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(ProviderApplication.class, args);

    }

}
