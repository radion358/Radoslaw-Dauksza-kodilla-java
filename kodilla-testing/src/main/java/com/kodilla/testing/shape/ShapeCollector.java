package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public Shape getFigure (int n) {
        if (n >= 0 && n <= shapeList.size()) {
            return shapeList.get(n);
        }
        return null;
    }

    public void removeFigure (Shape shape) {
        shapeList.remove(shape);

    }

    public List<Shape> showFigures() {
        return shapeList;

    }

}
