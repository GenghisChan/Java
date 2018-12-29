package com.christoferChan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = calculateScore("chris", 10);
        System.out.println(score);
        System.out.println(calculateScore(100));
        System.out.println(calculateScore());

    }

    public static int calculateScore(String playerName, int score){
        System.out.println(playerName + " scored " + score + " points!");
        return score;
    }

    public static int calculateScore(int score){
        System.out.println("Overloading Methods scored " + score + " points!");
        return score;
    }

    public static int calculateScore(){
        return 0;
    }
}
