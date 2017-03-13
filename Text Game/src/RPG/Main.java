package RPG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);

		System.out.println("A new wanderer!");
		System.out.println("Perfect timing, I need your help!");
		System.out.println("What is your name?");
		String FName = S.nextLine();
		System.out.println("Ehm " + FName + ", I meant your last name to?");
		String LName = S.nextLine();
		System.out.println(FName + " " + LName + ", My name is Gwen, Could you help me?");
		System.out.println("Do you help the stranger? " + "Yes : No");
		String YON = S.nextLine(); //Yes Or No
		{

			if (YON.equalsIgnoreCase("Yes")){

				System.out.println("Great! Follow me");
			    System.out.println("You and the stanger walks on a road towards a village");
			    System.out.println("Gwen :" + " We can spend the night in the tavern. Ill explain everything tomorow");
			}
			else if (YON.equalsIgnoreCase("No")) {
				System.out.println("You dont understand,If you dont help me many people will die!");
				System.out.println("Have you changed you mind? " + "Yes : No");

				String YON2 = S.nextLine(); //Yes Or No 2
				{

					if (YON2.equalsIgnoreCase("Yes"))
						System.out.println("Great! Follow me");

					else if (YON2.equalsIgnoreCase("NO")) {

						System.out.println("The stranger dont have time to answer before a man jumps out from a bush");
						System.out.println("Give me all your money! The man shouted");
						System.out.println("What do you do? " + "A : Attack, B : Do nothing");

						String FF = S.nextLine(); // FF= First Fight
						{
							if (FF.equalsIgnoreCase("A")) {
								System.out.println("The man dodge your attack and counter attack");
								System.out.println("You get hit in the head and pass out");
							}

							else if (FF.equalsIgnoreCase("B")) {
								System.out.println("You get hit in the head and pass out");
							}
						}

					}

				}

			}

		}
		
		 System.out.println("The next day you wake up in a room and Gwen is sitting next to your bed");
		 System.out.println("There are two other people sitting by a table in the room");
		 System.out.println("Gwen : " + FName + "! you finally woke up, i thought you weren't gonna wake up the for a moment");
		 System.out.println("Gwen : I can understand that you may wonder why i so despretly need your help");
		 System.out.println("Gwen : You see, there is a dark wizard ruling the lands with a iron fist");
		 System.out.println("Gwen : He has many followers running around and terrorizing people");
		 System.out.println("Gwen : Most of the resistance has just recently been wiped out since the HQ was reveald");
		 System.out.println("Gwen : Us three in this room are the only ones who are left");
		 System.out.println("Gwen : We need you to help us on our last mision to try and kill the wizard");
		 System.out.println("What is your response?");
		 System.out.println("A : I guess i owe you one so yes. B : Well i agreed to help so yes");
		 S.nextLine();
		 System.out.println("Gwen : Fantastic!");
		 System.out.println("Gwen takes out something from his pockets");
		 System.out.println("Gwen : These are power stones. Each one have different powers and the ones who embrace them will gain their powers");
		 System.out.println("Gwen : You will have to chose on of the stones and grant its power for our mission");
		 System.out.println("Gwen : The red stone grants power of a great warrior who is a master of using the sword");
		 System.out.println("Gwen : The blue stone grants intelect of a wizard who can stand from a far casting powerfull spells");
		 System.out.println("Gwen : The yellow stone grant strenght of a tank who can withstand alot of damage");
		 System.out.println("Gwen : The white stone grants healing powers for those who wants to support others in battle");
		 System.out.println("Which stone do you chose?");
		 System.out.println("A : Red, B : Blue, C : Yellow, D : White");
		 String Class = S.nextLine();
		 //Inte klar med lista:
		 //Behöver lägga till ett combat system som inte är riggat mot dig från början
		 //Fortsätta till nästa chapter i spelet minst
		 //Klasserna måste ordnas
		 //Seuvdo kod
		 
			
			

	}
}
