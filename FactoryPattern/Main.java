package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Create a factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a circle
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        // Create a rectangle
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();

        // Create a square
        Shape square = shapeFactory.createShape("SQUARE");
        square.draw();
    }
        
    }
}
