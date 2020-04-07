package com.sun.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Component 使用的是原来类
 * @Configuration 使用代理类
 */
@Component
//@Configuration
public class MyTestConfig {
    @Bean
    public Driver driver(){
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("driver");
        driver.setCar(car());
        System.out.println(this.getClass().getName());
        return driver;
    }

    @Bean
    public Car car(){
        Car car = new Car();
        car.setId(1);
        car.setName("car");
        System.out.println("生成一个car："+car);
        return car;
    }



}
