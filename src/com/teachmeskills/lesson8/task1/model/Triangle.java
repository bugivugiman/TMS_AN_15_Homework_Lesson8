package com.teachmeskills.lesson8.task1.model;

public class Triangle extends Shape{
    //fields
    double sideA;
    double sideB;
    double sideC;
    //constructors
    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    //methods
    public double getP(){
        double P = sideA + sideB + sideC;
        return P;
    }
    public double getS(){
        double p = (sideA + sideB + sideC) / 2;
        double S = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return S;
    }
}
