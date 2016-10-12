package dfd;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
     Scanner Desu = new Scanner(System.in);
     double t1,t2,answ;
     t1 = Desu.nextDouble();
     t2 = Desu.nextDouble();
     
      char t0 = Desu.next().charAt(0);
      
      switch (t0) {
	case '+':
		answ = t1+t2;
		
		break;
		
	case '-':
		answ = t1-t2;
		
		break;
		
	case '*':
		answ = t1*t2;
		
		break;
		
	case '/':
		answ = t1/t2;
		
		break;

	default:
		answ=0;
		break;
	}
      System.out.println(answ);
      
	}

}
