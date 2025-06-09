package com.example.bookapp.model;

public class TrafficLight {
    private String color;

    public TrafficLight() {}

    public TrafficLight(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAction() {
        return switch (color.toLowerCase()) {
            case "red" -> "STOP";
            case "yellow" -> "READY";
            case "green" -> "GO";
            default -> "INVALID COLOR";
        };
    }
    
}
