package com.klu;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Car car = (Car)context.getBean("car");
    car.drive();
    Bike bike = (Bike)context.getBean("bike");
    bike.ride();

  }

}