package by.jonline.htk02.main;
//Task 6: � n ����� ������� 80� ������.
//������� ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 � ������ ��� � �����

import java.util.Scanner;

public class Main3 {

	public static void milkV() {
		// TODO Auto-generated method stub

		int a=80;// V small barrel
		int b= a+12; // V big barrel
		int c;		
				
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("������� ������� ������� m:");
			int m=scan.nextInt();
			c=m*b;
			
			System.out.println("� ������� ������� �����:" + c + "������");
			
		}
	}

}
