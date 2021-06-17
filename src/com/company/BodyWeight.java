package com.company;

import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz ornek : 105");
        double kilo= in.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz ornek 1,72");
        double height=in.nextDouble();
        double totalWeight= kilo/(height*height);
        System.out.println("Vücut Kitle İndeksiniz :"+totalWeight);
    }
}
