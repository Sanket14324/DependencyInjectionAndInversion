package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bike implements Vehicle{


//    @Autowired
//    private Vehicle car;
//
//    public Vehicle getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }

    private void ride(){
        System.out.println("ride method called");
    }
    public void drive(){
//        car.drive();
        ride();
        System.out.println("Bike is called");
    }
}
