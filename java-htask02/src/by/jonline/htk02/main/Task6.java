package by.jonline.htk02.main;
//Task 6: в n малых бидонах 80л молока.
//сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л больше чем в малом

import java.util.Scanner;

public class Task6 {

	public static void milkV() {
		

		int a=80;// V small barrel
		int b= a+12; // V big barrel
		int c;		
		System.out.println("—колько больших бидонов m:");		
	//	try  {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
				int m=scan.nextInt();
				
				c=m*b;
				
				System.out.println("¬ больших бидонах всего:" + c + "литров");	
				
	/*	}
		catch(Exception e) { 
	         /* This block will only execute if any exception 
	          * occurs in try block
	          */
	 //        System.out.println("ѕохоже вы ввели что-то не то");		
	//	}
	 
}
}