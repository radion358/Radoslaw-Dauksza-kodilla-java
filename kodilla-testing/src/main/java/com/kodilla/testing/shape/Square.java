package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getField() {
        return length * length;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return length == square.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
