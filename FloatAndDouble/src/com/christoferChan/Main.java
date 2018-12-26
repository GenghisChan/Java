package com.christoferChan;

public class Main {

    public static void main(String[] args) {

        int myInt = 5%2;
        float myFloat = 5/2f;
        double myDouble = 5d / 3d;

        //Weight Converter - lb to kg
        double weight = 220d;
        double kg = .453592737d;

        double weightInKilograms = weight * kg;


        System.out.println(weight + "lbs to kg = " + weightInKilograms);

    }
}
