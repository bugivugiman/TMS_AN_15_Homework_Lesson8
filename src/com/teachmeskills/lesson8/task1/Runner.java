package com.teachmeskills.lesson8.task1;

import com.teachmeskills.lesson8.task1.model.Circle;
import com.teachmeskills.lesson8.task1.model.Rectangle;
import com.teachmeskills.lesson8.task1.model.Shape;
import com.teachmeskills.lesson8.task1.model.Triangle;

public class Runner {
    public static void main(String[] args) {

        double P = 0;
        Shape [] shapes = new Shape[5];
        //data
        shapes[0] = new Circle(2.15);
        shapes[1] = new Rectangle(5.56, 8.79);
        shapes[2] = new Triangle(4.11, 6.58, 7.44);
        shapes[3] = new Circle(1.93);
        shapes[4] = new Rectangle(14.14, 63.63);

        for(int i = 0; i < shapes.length; i++){
            P += shapes[i].getP();

            System.out.println("figure area is :" + shapes[i].getS());
        }
        System.out.println("============================");
        System.out.println("everyone figure area - " + P);


    }
}
