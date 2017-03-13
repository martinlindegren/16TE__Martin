package Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Main {
	public static void main(String[] args) {

		System.out.print("Type word: ");

		// Calling the scanner method

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		// Closing the scanner method
		scan.close();

		// The method that randomize characters

		Random r = new Random();

		// Creating an Arraylist for the characters
		ArrayList<Character> chars = new ArrayList<Character>();

		// Adds the characters in the list based on the word you put in
		for (int i = 0; i < word.length(); i++) {

			chars.add(word.charAt(i));
		}
        
		for(int k = 0; k < fakt(word.length()); k++){
			
		    //Creates a loop that use the Random method to randomize the chars
			for (int s = 0; s < word.length(); s++) {
				char g = chars.get(r.nextInt(chars.size()));
				//prints out the result
				System.out.print(g);
				//Removes the char already printed
				chars.remove(chars.indexOf(g));
			}
			// Adds the chars again to print out more results
			for (int i = 0; i < word.length(); i++) {
				chars.add(word.charAt(i));
			}
			System.out.print("\n");
		}
		}
	//counting how many combinations is possible based on the word
	public static int fakt(int n) {
        int fakt = 1;
        for (int i = 1; i <= n; i++) {
        	fakt *= i;
        }
        return fakt;
    }
	
	}

	
			

