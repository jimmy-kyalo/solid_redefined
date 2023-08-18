package com.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.area());

        Square square = new Square(10);
        System.out.println(square.area());

        Cube cube = new Cube(10);
        System.out.println(cube.volume());

        Cuboid cuboid = new Cuboid(10, 20, 30);
        System.out.println(cuboid.volume());
    }
}