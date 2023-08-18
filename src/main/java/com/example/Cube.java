package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cube implements ThreeDimensionalShape {
    private final double length;

    @Override
    public double volume() {
        return Math.pow(getLength(), 3);
    }

}
