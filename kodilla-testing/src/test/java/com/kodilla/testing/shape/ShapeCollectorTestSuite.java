package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);

        //When
        shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(shape, shapeCollector.getFigure(0));
        Assert.assertEquals(1, shapeCollector.showFigures().size());
    }

    @Test
    public void testGetFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        shapeCollector.addFigure(shape);

        //When
        Shape retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape, retrievedShape);
    }

    @Test
    public void testGetFigureOutOfScope() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape retrievedShape = shapeCollector.getFigure(-1);

        //Then
        Assert.assertEquals(null , retrievedShape);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(0, shapeCollector.showFigures().size());
    }

    @Test
    public void testShowFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = new ArrayList<>();
        Shape square = new Square(5);

        //When
        shapeCollector.addFigure(square);
        shapeList.add(square);

        //Then
        Assert.assertEquals( shapeList , shapeCollector.showFigures());
    }
}
