package com.example.bookapp.model;

public class Shape {
    private String shape;
    private double radius;
    private double length;
    private double breadth;
    private double base;
    private double height;

    // Getters and Setters
    public String getShape() { return shape; }
    public void setShape(String shape) { this.shape = shape; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getBreadth() { return breadth; }
    public void setBreadth(double breadth) { this.breadth = breadth; }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Area calculation based on shape
    public double calculateArea() {
        return switch (shape) {
            case "circle" -> Math.PI * radius * radius;
            case "rectangle" -> length * breadth;
            case "triangle" -> 0.5 * base * height;
            default -> 0.0;
        };
    }
}
