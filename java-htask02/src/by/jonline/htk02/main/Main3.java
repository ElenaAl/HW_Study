package by.jonline.htk02.main;
//Task 6: в n малых бидонах 80л молока.
//сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л больше чем в малом

import java.util.Scanner;

public class Main3 {

	public static void milkV() {
		// TODO Auto-generated method stub

		int a=80;// V small barrel
		int b= a+12; // V big barrel
		int c;		
				
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Сколько больших бидонов m:");
			int m=scan.nextInt();
			c=m*b;
			
			System.out.println("В больших бидонах всего:" + c + "литров");
			
		}
	}

}
