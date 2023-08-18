package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle implements Shape {
    private final double radius;

    @Override
    public double area() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }

}
