package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cuboid implements ThreeDimensionalShape {
    private final double length;
    private final double width;
    private final double height;

    @Override
    public double volume() {
        return getLength() * getWidth() * getHeight();
    }
}
