package com.yyy;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    boolean gameover=true;
	    int score=5000;
	    int levelComplete=5;
	    int bonus=100;

	    if(score==4000) {
			System.out.println("Your score was 5000");
			System.out.println("This was executed");
		}

		if(score==4000)
			System.out.println("Your score was 5000");
			System.out.println("This was executed");

	    // Jeżeli po if są klamry to rzeczy w klamrach odnoszą się do warunku.
		// Jeśli nie ma klamer, to do warunku odnosi się tylko jedna linijka.
		//

		System.out.println("Następne część");

		if(score<=5000){
			System.out.println("Your score is less than 5000");
		} else {
			System.out.println("Got here");
		}

		if (score<5000 && score>1000) {
			System.out.println("Your score is less than 5000 but greater than 1000");
		} else if (score<1000) {
			System.out.println("Your score is less than 1000");
		} else {
			System.out.println("Got here");
		}

		if (gameover==true) {
			// if (gameover==true) to to samo, co if (gameover)
			int finalScore=score+(levelComplete*bonus);
			System.out.println("Your final score is "+finalScore);
		}

		// Challenge

		score=10000;
		levelComplete=8;
		bonus=200;
		if (gameover) {
			int secondScore=score+(levelComplete*bonus);
			System.out.println("Second score is "+secondScore);
		}
    }
}
