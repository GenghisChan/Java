package com.christoferChan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = 0;
        if(minutes >= 0 && seconds >= 0 && seconds <= 59){
            while(minutes >= 60){
                minutes -= 60;
                  hours+= 1;
            }

            if(seconds == 0) {
                return (hours + "h" + minutes + "m" + "00s");
            }

            return (hours + "h" + minutes + "m" + + seconds + "s");
        }

        return "Invalid Value";
    }

    public static String getDurationString(int seconds){
        int minutes = 0;

        if(seconds >= 0){
            while(seconds >= 60){
                seconds -= 60;
                minutes+= 1;
            }

            return getDurationString(minutes, seconds);
        }

        return "Invalid value";
    }
}
