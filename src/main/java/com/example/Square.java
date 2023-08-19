package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square implements Shape {
    private final double length;

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }

    public void setLength(int i) {
    }

}
