package com.kgisl.springinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 */
public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Company company = context.getBean(Company.class);
      company.showEmployeeInfo();
      context.close();
   }
}