package HangMan;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String[] NyckelOrd = {"programering", "greetings", "hello"};
		
		int V�ljOrd = (int) (Math.random() * NyckelOrd.length);
		 //Skapar en array f�r inskrivna bokts�ver
		 char[] SkrivnaBokst�ver = new char[NyckelOrd[V�ljOrd].length()];
		 int F�rs�k = 0;
		 boolean Gissning = false;
		 do {
			//spelar om cykeln s� l�nge SkrivnaBokst�ver �terv�nder true
			//om SkrivnaBokst�ver �terv�nder false har anv�ndaren gissat r�tt ord
			 switch (SkrivBokstav(NyckelOrd[V�ljOrd], SkrivnaBokst�ver) )   {
	            case 0:
	                F�rs�k++;
	                break;
	            case 1:
	                F�rs�k++;
	                break;
	            case 2:
	                break;
	            case 3:
	                Gissning = true;
	                break;
	                //situationer om man har fel
	        }
			 if (F�rs�k == 1){
				 System.out.print("\nEn kulle ritades");
				 
			 }
			 else if (F�rs�k == 2){
				 System.out.print("\nEtt tr�d ritades ");
			 }
			 else if (F�rs�k == 3){
				 System.out.print("\nEtt sn�re ritades ");
			 }
			 else if (F�rs�k == 4){
				 System.out.print("\nEtt huvud ritades ");
			 }
			 else if (F�rs�k == 5){
				 System.out.print("\nEn kropp ritades ");
			 }
			 else if (F�rs�k == 6){
				 System.out.print("\nEn arm ritades ");
			 }
			 else if (F�rs�k == 7){
				 System.out.print("\nEn till arm ritades ");
			 }
			 else if (F�rs�k == 8){
				 System.out.print("\nEtt ben ritades ");
			 }
			 else if (F�rs�k == 9){
				 System.out.print("\nEtt till ben ritades ");
				 System.out.print("\nGubben �r h�ngd, du f�rlora! ");
				 System.exit(1);
			 }
		 }
		     while (! Gissning);
	        System.out.println("\nOrdet �r " + NyckelOrd[V�ljOrd] +
		            " F�rs�k " + (F�rs�k -findEmptyPosition(SkrivnaBokst�ver)) +
		            " G�ng(er)");
	}
	/**
	 * 
	 * @param ord
	 * @param SkrivnaBokst�ver
	 * @return
	 */
			 public static int SkrivBokstav(String ord, char[] SkrivnaBokst�ver)    {
				 
				System.out.print("\nGissa en Bokstav ");
				
				if (! PrintaNyckelOrd (ord, SkrivnaBokst�ver))
					return 3;
			      System.out.print(" : ");
			      Scanner S = new Scanner(System.in);
			      int TomPlats = findEmptyPosition(SkrivnaBokst�ver);
			      char Inmatning = S.nextLine().charAt(0);
			  
			      if (inSkrivnaBokst�ver(Inmatning, SkrivnaBokst�ver)) {
			    	  System.out.print(Inmatning + "Finns redan i ordet");
			    	  return 2;
			      }
			      else if (ord.contains(String.valueOf(Inmatning))) {
			    	  SkrivnaBokst�ver[TomPlats] = Inmatning;
			    	  return 1;
			      }
			      else {
			    	  System.out.print(Inmatning + " Finns inte i ordet");
			    	  return 0;
			      }
			    	  
			      
				
				
			 
			 }
			 //Printar stj�rnor istellet f�r bokst�ver f�r att d�lja ordet
			 //Return true om stj�rnor printas, arnars return false
			  public static boolean PrintaNyckelOrd(String ord, char[] SkrivnaBokst�ver) {
			 //kollar igenom ordets bokst�ver
			        boolean asteriskPrinted = false;
			        for (int i = 0; i < ord.length(); i++) {
			            char letter = ord.charAt(i);
			     //kollar om anv�ndaren redan skrivigt bokstaven
			            if (inSkrivnaBokst�ver(letter, SkrivnaBokst�ver))
			                System.out.print(letter); 
			            else {
			                System.out.print('*');
			                asteriskPrinted = true;
			            }
			        }
			        return asteriskPrinted;
			    }
			  //kollar om bokstaven finns i SkrivnaBokst�ver
			   public static boolean inSkrivnaBokst�ver(char Bokstav, char[] SkrivnaBokst�ver) {
			        return new String(SkrivnaBokst�ver).contains(String.valueOf(Bokstav));
			    }
			  //Leta reda p� f�rsta tomma position
			 public static int findEmptyPosition(char[] SkrivnaBokst�ver) {
			        int i = 0;
			        while (SkrivnaBokst�ver[i] != '\u0000') i++;
			        return i;
			    }
		 }
	

	


