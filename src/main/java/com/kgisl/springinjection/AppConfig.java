package com.kgisl.springinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kgisl.springinjection")
public class AppConfig {
   @Bean
   public Employee getEmployee() {
      return new EmployeeImp();
   }
}