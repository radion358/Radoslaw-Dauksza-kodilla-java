package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private int radius;
    private final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return pi * (radius * radius);
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pi);
    }
}
