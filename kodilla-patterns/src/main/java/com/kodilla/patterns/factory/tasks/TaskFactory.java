package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("buy milk", "milk", 1);
            case PAINTING:
                return new PaintingTask("paint corridor", "blue", "corridor");
            case DRIVING:
                return new DrivingTask("drive to shop", "shop", "car");
            default:
                return null;
        }

    }
}
