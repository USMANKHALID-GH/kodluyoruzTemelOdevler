package com.company;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the radius");
        double rad=in.nextDouble();
        System.out.println("enter the angle");
        double angle= in.nextDouble();
        double area= (angle*Math.PI*Math.pow(rad,2))/360;
        System.out.println("the area of the cirlce with a given angle and radius ="+area);
    }
}
