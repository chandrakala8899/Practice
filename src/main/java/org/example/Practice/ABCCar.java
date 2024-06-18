package org.example.Practice;

public class ABCCar {
    private String colour;   // String will be replace classes
    private String dashBoard;
    private String wheels;
    private String engine;
    public ABCCar(String colour, String dashBoard, String wheels){
        this(colour,dashBoard,wheels,"50000");

    }
    public ABCCar(String colour, String dashBoard, String wheels, String engine) {
        this.colour = colour;
        this.dashBoard = dashBoard;
        this.wheels = wheels;
        this.engine = engine;
    }
}
