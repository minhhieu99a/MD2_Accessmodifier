package com.codegym;

public class Circle {
    private double radius=1;
    private  String color="red";

    Circle (double radius){
        this.radius=radius;
    }
    protected double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
