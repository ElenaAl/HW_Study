package by.jonline.htk02.main;

import java.util.Scanner;

public class Task10 {
// ��������� �������� ��������� �� �������( ��� ���������� ��������� �������������� ��������)
//(sin x+cos y)/(cos x - sin y)*tg xy
	
	public static void sincos() 
		{
			
		System.out.println("������� �������z x � y:");
 
     		@SuppressWarnings("resource")
			Scanner scan3 = new Scanner(System.in);
     		double x=scan3.nextDouble();
     		double y=scan3.nextDouble();
     		double a, b, c, d, e, f;
     		
     		a= Math.sin(x);
     		b = Math.cos(y);
     		c = Math.tan(x*y);
     		e= Math.sin(y);
     		f = Math.cos(x);
     		
			d=((a+b)/(f-e)*c);
			
				System.out.println("��������� (sin x+cos y)/(cos x - sin y)*tg xy =" + d);
				
		}
		

	}

