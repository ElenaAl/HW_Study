package by.jonline.htk02.main;

import java.util.Scanner;

public class Task7 {
// ����� S �������������� ������ �������� � ��� ���� ������ �����
	
	public static void rectangleS() 
		{
			
		System.out.println("������� �������� ����� �������������� (>0):");
     //	try  {
     		@SuppressWarnings("resource")
			Scanner scan2 = new Scanner(System.in);
     		int l=scan2.nextInt();
		
				int w=l/2;
				int s=l*w;
				
				System.out.println("������� ��������������, ������ �������� � ��� ���� ������ �����:" + s);
				
	//	}
     //	catch(Exception e) { 
	         /* This block will only execute if any exception 
	          * occurs in try block
	          */
				 //	       System.out.println("������ �� ����� ���-�� �� ��");		
				 //		}
		}
		

	}


