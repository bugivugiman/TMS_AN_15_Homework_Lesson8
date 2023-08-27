package com.teachmeskills.lesson8.task1.model;

public class Rectangle extends Shape{
    //fields
    double sideA;
    double sideB;
    //constructors
    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    //methods
    public double getP(){
        double P = (sideA + sideB) * 2;
        return P;
    }
    public double getS(){
        double S = sideA * sideB;
        return S;
    }
}
