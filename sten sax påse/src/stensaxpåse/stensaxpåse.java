package stensaxpåse;

import java.util.Random;
import java.util.Scanner;

public class stensaxpåse {

	public static void main(String[] args) {
		int  computerInt, spc;
		int spcsc=0;
		int compsc=0;

		String computerPlay = null;

		String response;

		Scanner desu = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("sten sax eller påse");
		System.out.println("1 = sten, 2 = sax, 3= påse");
		// prints out the greeting words

		for (int i = 0; i < 3;) {
        // for loop that loops the code until 3 points has been given out
			computerInt = generator.nextInt(3) + 1;
			// the computer generates a number 1-3
			if (computerInt == 1)
				computerPlay = "sten";
			else if (computerInt == 2)
				computerPlay = "sax";
			else if (computerInt == 3)
				computerPlay = "påse";
			// Computer gets sten,sax or påse depending on the number it generated

			spc = desu.nextInt();

			System.out.println("computerPlay is " + computerPlay);
			//prints out your and the computers play
			if(spc == computerInt-1){
				System.out.println("Ez win");
				spcsc++;
				i++;
				System.out.println("Current score :"+ spcsc+"-"+compsc);
			}else if(spc == computerInt){
				System.out.println("Trade off happend");
			}else{
				System.out.println("U Lost m8");
				compsc++;
				i++;
				System.out.println("Current score :"+ spcsc+"-"+compsc);
			
				// Rules if you win, loose or draw
			}
		}

	}
}
