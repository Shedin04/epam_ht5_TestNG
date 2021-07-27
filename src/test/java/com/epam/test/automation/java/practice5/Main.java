package com.epam.test.automation.java.practice5;

public class Main {

    public static void main(String[] args) {
        Rectangle sides = new Rectangle(2, 3);
        System.out.println(sides.area() + " | " + sides.perimeter() + " | " + sides.isSquare());
        sides.replaceSides();
        System.out.println(sides.getSideA()+" | "+sides.getSideB());
    }
}