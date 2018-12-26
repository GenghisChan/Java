package com.christoferChan;

public class Main {

    public static void main(String[] args) {

        int topScore = 100;
        int secondBest = 119;
        if ( topScore < 100 || secondBest == 99)
            System.out.println(secondBest);
        else
            System.out.println("Wow we dont need curly brackets in Java");

        boolean facts = topScore >= 100 ? true : false;
        System.out.println(facts);


        double firstNum = 20;
        double secondNum = 80;

        double result = (firstNum + secondNum) * 25;

        double remainder = result % 40;

        if(remainder <= 20)
            System.out.println("Total was over the limit");


    }
}
