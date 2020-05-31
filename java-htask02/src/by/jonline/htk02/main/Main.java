package by.jonline.htk02.main;



//z = ( (a – 3 ) * b / 2) + c).
public class Main{

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		double z;
		
		a=2.5;
		b=3.2;
		c=5.0;
		
		z= ((a - 3 ) * b / 2) + c;
		System.out.println(z);
	
		
//z = 2*x + (y-2)*5.	
		
		double y=1.3;
		double x=4.6;
	
		
		z = 2*x + (y-2)*5;
		System.out.println(z);
	
		try  {
	Task5.avArifm();// Task 5:algorithm arithmetic average of two numbers
	
	Task6.milkV();//Task 6: volume of milk in big barrels
	
	Task7.rectangleS();//Task 7: S of rectangle
	}
		catch(Exception e) { 
	         /* This block will only execute if any exception 
	          * occurs in try block
	          */
	         System.out.println("Похоже вы ввели что-то не то");		
		}
}
}

