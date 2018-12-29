package com.christoferChan;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Testing "+
//                "To see "+
//                "If this would work "+
//                "Id like to know how to make a multilinestring\n"+
//                "Test"
//                );
//        System.out.println("is this on the same line");


//        System.out.println(calculateScore(false, 100, 5, 1000));
        displayHighScorePosition("chris", 1);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        if(gameOver == true){
            int finalScore = score + (level * bonus);
            System.out.println("final score: " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position: " + position  + " on the highscore table");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;
//
//    }
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
