//даны два действительных числа x и y.
//Вычислить их сумму, разность, произведение и частное


package by.jonline.htk01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		double a;
		double b;
		double c;
		double d;
		
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Введите значение х:");
		 double x=scan.nextDouble();
		 
		 
		 System.out.println("Введите значение y:");
		 double y=scan.nextDouble();
		 
		 a=x+y; 
		 b=x-y;
		 c=x*y;
		 d=x/y;
	}
	System.out.println("Значение a; сумма x, y="+ a);
	 System.out.println("разница x, y ="+b );
	 System.out.println("произведение x, y ="+c );
	 System.out.println("результат деления x на y ="+d );
	 
	 
	 
// найдем значение функции c=3+a
	 
	 c=3+a;
	 
	 System.out.println("сумма 3+a="+ c);
	 
	}

}
