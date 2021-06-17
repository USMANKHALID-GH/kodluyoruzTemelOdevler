package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int km;
        Scanner input = new Scanner(System.in);
        System.out.println("enter km");
        km=input.nextInt();
        double startingPrice=2.20;
        double total=km*startingPrice;
        total=(total<20)? 20: total;
        System.out.println("payment to be made is :"+total);
    }
}
