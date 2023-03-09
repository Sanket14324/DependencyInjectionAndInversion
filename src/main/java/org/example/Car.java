package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    public void drive(){
        System.out.println("Car is called");
    }
}
