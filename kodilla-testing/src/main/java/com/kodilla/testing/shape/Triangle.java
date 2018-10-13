package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private int triangleBase;
    private int triangleHeight;

    public Triangle(int triangleBase, int triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getField() {
        return (double)(triangleBase * triangleHeight) /2;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangleBase == triangle.triangleBase &&
                triangleHeight == triangle.triangleHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(triangleBase, triangleHeight);
    }
}
