package HangMan;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String[] NyckelOrd = {"programering", "greetings", "hello"};
		
		int VäljOrd = (int) (Math.random() * NyckelOrd.length);
		 //Skapar en array för inskrivna boktsäver
		 char[] SkrivnaBokstäver = new char[NyckelOrd[VäljOrd].length()];
		 int Försök = 0;
		 boolean Gissning = false;
		 do {
			//spelar om cykeln så länge SkrivnaBokstäver återvänder true
			//om SkrivnaBokstäver återvänder false har användaren gissat rätt ord
			 switch (SkrivBokstav(NyckelOrd[VäljOrd], SkrivnaBokstäver) )   {
	            case 0:
	                Försök++;
	                break;
	            case 1:
	                Försök++;
	                break;
	            case 2:
	                break;
	            case 3:
	                Gissning = true;
	                break;
	                //situationer om man har fel
	        }
			 if (Försök == 1){
				 System.out.print("\nEn kulle ritades");
				 
			 }
			 else if (Försök == 2){
				 System.out.print("\nEtt träd ritades ");
			 }
			 else if (Försök == 3){
				 System.out.print("\nEtt snöre ritades ");
			 }
			 else if (Försök == 4){
				 System.out.print("\nEtt huvud ritades ");
			 }
			 else if (Försök == 5){
				 System.out.print("\nEn kropp ritades ");
			 }
			 else if (Försök == 6){
				 System.out.print("\nEn arm ritades ");
			 }
			 else if (Försök == 7){
				 System.out.print("\nEn till arm ritades ");
			 }
			 else if (Försök == 8){
				 System.out.print("\nEtt ben ritades ");
			 }
			 else if (Försök == 9){
				 System.out.print("\nEtt till ben ritades ");
				 System.out.print("\nGubben är hängd, du förlora! ");
				 System.exit(1);
			 }
		 }
		     while (! Gissning);
	        System.out.println("\nOrdet är " + NyckelOrd[VäljOrd] +
		            " Försök " + (Försök -findEmptyPosition(SkrivnaBokstäver)) +
		            " Gång(er)");
	}
	/**
	 * 
	 * @param ord
	 * @param SkrivnaBokstäver
	 * @return
	 */
			 public static int SkrivBokstav(String ord, char[] SkrivnaBokstäver)    {
				 
				System.out.print("\nGissa en Bokstav ");
				
				if (! PrintaNyckelOrd (ord, SkrivnaBokstäver))
					return 3;
			      System.out.print(" : ");
			      Scanner S = new Scanner(System.in);
			      int TomPlats = findEmptyPosition(SkrivnaBokstäver);
			      char Inmatning = S.nextLine().charAt(0);
			  
			      if (inSkrivnaBokstäver(Inmatning, SkrivnaBokstäver)) {
			    	  System.out.print(Inmatning + "Finns redan i ordet");
			    	  return 2;
			      }
			      else if (ord.contains(String.valueOf(Inmatning))) {
			    	  SkrivnaBokstäver[TomPlats] = Inmatning;
			    	  return 1;
			      }
			      else {
			    	  System.out.print(Inmatning + " Finns inte i ordet");
			    	  return 0;
			      }
			    	  
			      
				
				
			 
			 }
			 //Printar stjärnor istellet för bokstäver för att dölja ordet
			 //Return true om stjärnor printas, arnars return false
			  public static boolean PrintaNyckelOrd(String ord, char[] SkrivnaBokstäver) {
			 //kollar igenom ordets bokstäver
			        boolean asteriskPrinted = false;
			        for (int i = 0; i < ord.length(); i++) {
			            char letter = ord.charAt(i);
			     //kollar om användaren redan skrivigt bokstaven
			            if (inSkrivnaBokstäver(letter, SkrivnaBokstäver))
			                System.out.print(letter); 
			            else {
			                System.out.print('*');
			                asteriskPrinted = true;
			            }
			        }
			        return asteriskPrinted;
			    }
			  //kollar om bokstaven finns i SkrivnaBokstäver
			   public static boolean inSkrivnaBokstäver(char Bokstav, char[] SkrivnaBokstäver) {
			        return new String(SkrivnaBokstäver).contains(String.valueOf(Bokstav));
			    }
			  //Leta reda på första tomma position
			 public static int findEmptyPosition(char[] SkrivnaBokstäver) {
			        int i = 0;
			        while (SkrivnaBokstäver[i] != '\u0000') i++;
			        return i;
			    }
		 }
	

	


