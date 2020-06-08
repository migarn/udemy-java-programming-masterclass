package com.yyy;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        getDurationString(2560, 49);
        getDurationString(15684156);
    }

    private static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            int hours = minutes / 60;
            int newminutes = minutes - hours * 60;

            String hoursString = timeStringMethod(hours);
            String minutesString = timeStringMethod(minutes);
            String newminutesString = timeStringMethod(newminutes);
            String secondsString = timeStringMethod(seconds);

            System.out.println(minutesString + "m " + secondsString + "s is " +
                    hoursString + "h " + newminutesString + "m " + secondsString + "s");
        }
    }

    private static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            int minutes = seconds / 60;
            int newseconds = seconds - minutes * 60;

            String minutesString = timeStringMethod(minutes);
            String secondsString = timeStringMethod(seconds);
            String newsecondsString = timeStringMethod(newseconds);

            System.out.println(secondsString + "s is " + minutesString + "m " + newsecondsString + "s");
            getDurationString(minutes, newseconds);
        }
    }

    private static String timeStringMethod(int time) {
        String timeString = time + "";
        if (time < 10) {
            timeString = "0" + timeString;
        }
        return timeString;
    }


}
