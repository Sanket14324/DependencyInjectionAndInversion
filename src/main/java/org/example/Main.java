package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // for getting bean configuration from the xml file
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext factory  =new AnnotationConfigApplicationContext(AutoConfig.class);
//        Bike mazi =  factory.getBean(Bike.class);
        Vehicle my = (Vehicle) factory.getBean(Bike.class);
        my.drive();

//        Tyre tyre = (Tyre) context.getBean("tyre");
//        System.out.println(tyre);
    }
}