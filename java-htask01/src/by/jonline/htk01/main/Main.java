//���� ��� �������������� ����� x � y.
//��������� �� �����, ��������, ������������ � �������


package by.jonline.htk01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		double a;
		double b;
		double c;
		double d;
		
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("������� �������� �:");
		 double x=scan.nextDouble();
		 
		 
		 System.out.println("������� �������� y:");
		 double y=scan.nextDouble();
		 
		 a=x+y; 
		 b=x-y;
		 c=x*y;
		 d=x/y;
	}
	System.out.println("�������� a; ����� x, y="+ a);
	 System.out.println("������� x, y ="+b );
	 System.out.println("������������ x, y ="+c );
	 System.out.println("��������� ������� x �� y ="+d );
	 
	 
	 
// ������ �������� ������� c=3+a
	 
	 c=3+a;
	 
	 System.out.println("����� 3+a="+ c);
	 
	}

}
