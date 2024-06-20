//Klasa Shape (w pakiecie com.example.shapes)


package com.example.shapes;

/**
 * Abstrakcyjna klasa reprezentująca kształt geometryczny.
 */
public abstract class Shape {

    /**
     * Metoda abstrakcyjna do obliczania pola powierzchni kształtu.
     * @return Pole powierzchni kształtu
     */
    public abstract double calculateArea();
}


//Klasa Circle (w pakiecie com.example.shapes)


package com.example.shapes;

/**
 * Klasa reprezentująca okrąg dziedzicząca po Shape.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


Klasa MainApp (w pakiecie com.example.main)


package com.example.main;

import com.example.shapes.Circle;
import com.example.shapes.Shape;

/**
 * Główna klasa aplikacji.
 */
public class MainApp {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Pole powierzchni okręgu: " + area);

        // Użycie klasy abstrakcyjnej Shape
        Shape shape = new Circle(3.0);
        double shapeArea = shape.calculateArea();
        System.out.println("Pole powierzchni kształtu: " + shapeArea);
    }
}


