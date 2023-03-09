package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example")
public class AutoConfig {

    @Bean
    public  Bike getBike(){
        return new Bike();
    }

    @Bean
    public Vehicle getCar(){return new Car();}
}
