package com.yyy;

public class Main {

    public static void main(String[] args) {

        int highscore=calculateScore(true,800, 5, 100);
        System.out.println("Your final score was "+highscore);

        highscore=calculateScore(false,10000,8,200);
        System.out.println("Your final score was "+highscore);

        // Challenge
        System.out.println("Czas na challenge");

        String playerName="Andrzej";
        int playerScore=1500;
        int highScorePosition=calculateHighscorePosition(playerScore);
        displayHighScorePosition(playerName,highScorePosition);

        playerName="Jerzy";
        playerScore=900;
        highScorePosition=calculateHighscorePosition(playerScore);
        displayHighScorePosition(playerName,highScorePosition);

        playerName="Janusz";
        playerScore=400;
        highScorePosition=calculateHighscorePosition(playerScore);
        displayHighScorePosition(playerName,highScorePosition);

        playerName="Stefan";
        playerScore=50;
        highScorePosition=calculateHighscorePosition(playerScore);
        displayHighScorePosition(playerName,highScorePosition);
        }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score table.");
    }

    public static int calculateHighscorePosition(int playerScore) {
//        if (playerScore>=1000) {
//            return 1;
//        } else if (playerScore>=500) {
//            return 2;
//        } else if (playerScore>=100) {
//            return 3;
//        }
//        return 4;

        int position=4;
        if(playerScore>=1000) {
            position=1;
        } else if (playerScore>=500) {
            position=2;
        } else if (playerScore>=100) {
            position=3;
        }
        return position;
    }


    public static int calculateScore(boolean gameover, int score, int levelComplete, int bonus){


        if (gameover==true) {
            int finalScore=score+(levelComplete*bonus);
            finalScore+=1000;
            return finalScore;
        }
        return -1;
    }
}
