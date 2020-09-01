package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        car car1 = new car();
        van van1 = new van();
        bike bike1 = new bike();

        car1.showCarData();
        System.out.println("");
        van1.showvandata();
        System.out.println("");
        bike1.showbikedata();
        System.out.println("");

        bike1.accelerate();
        car1.vehicalbarek();
        van1.start();





    }
}
