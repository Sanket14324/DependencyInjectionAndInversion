package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand = "MRF";

    //if we want to use the constructor inject

//    public Tyre(String brand){
//        this.brand = brand;
//    }


    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
