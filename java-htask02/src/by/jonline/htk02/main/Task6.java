package by.jonline.htk02.main;
//Task 6: � n ����� ������� 80� ������.
//������� ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 � ������ ��� � �����

import java.util.Scanner;

public class Task6 {

	public static void milkV() {
		

		int a=80;// V small barrel
		int b= a+12; // V big barrel
		int c;		
		System.out.println("������� ������� ������� m:");		
	//	try  {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
				int m=scan.nextInt();
				
				c=m*b;
				
				System.out.println("� ������� ������� �����:" + c + "������");	
				
	/*	}
		catch(Exception e) { 
	         /* This block will only execute if any exception 
	          * occurs in try block
	          */
	 //        System.out.println("������ �� ����� ���-�� �� ��");		
	//	}
	 
}
}