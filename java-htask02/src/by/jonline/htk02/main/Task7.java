package by.jonline.htk02.main;

import java.util.Scanner;

public class Task7 {
// Найти S прямоугольника ширина которога в два раза меньше длины
	
	public static void rectangleS() 
		{
			
		System.out.println("Введите значение длины прямоугольника (>0):");
     //	try  {
     		@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
     		int l=scan2.nextInt();
		
				int w=l/2;
				int s=l*w;
				
				System.out.println("Площадь прямоугольника, ширина которого в два раза меньше длины:" + s);
				
	//	}
     //	catch(Exception e) { 
	         /* This block will only execute if any exception 
	          * occurs in try block
	          */
				 //	       System.out.println("Похоже вы ввели что-то не то");		
				 //		}
		}
		

	}


