package com.teachmeskills.lesson8.task1.model;

public class Circle extends Shape{
    //fields
    double radius;
    //constructors
    public Circle(double radius){
        this.radius = radius;
    }
    //methods
    public double getP(){
        double P = 2 * 3.1415 * radius;
        return P;
    }

    public double getS(){
        double S = 3.1415 * radius * radius;
        return S;

    }
}
