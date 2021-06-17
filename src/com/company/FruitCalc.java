package com.company;

import java.util.Scanner;

public class FruitCalc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double Armut = 2.14,
        Elma = 3.67,
        Domates =1.11,
        Muz=0.95 ,
        Patlıcan = 5.00;
        System.out.println("Enter the kilo of the fruit");
        System.out.println("\bArmut");
        double ArmutKilo= in.nextDouble();
        double armutPrice=ArmutKilo*Armut;
        System.out.println("\bELma:");
        double ElmaKilo= in.nextDouble();
        double elmaPrice=ElmaKilo*Elma;
        System.out.println("\bDomates");
        double DomatatKilo= in.nextDouble();
        double domaPrice=DomatatKilo*Domates;
         System.out.println("\bMuz");
        double muzKilo= in.nextDouble();
        double muzprice=muzKilo*Muz;
        System.out.println("\bPatlican");
        double patlicanKilo= in.nextDouble();
        double patPRICE=patlicanKilo*Patlıcan;
        double totalPrice=armutPrice+elmaPrice+domaPrice+muzprice+patPRICE;
        System.out.println("the total price : "+ totalPrice);



    }
}
