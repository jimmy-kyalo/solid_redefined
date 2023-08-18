package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public double area() {
        return getLength() * getWidth();
    }

}
