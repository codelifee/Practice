package part1.ex2.switch_;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
	
	int kor1, kor2, kor3;
	int total;
	float avg;
	int menu;

	Scanner scan = new Scanner(System.in);
	
	kor1 = 0;
	kor2 = 0;
	kor3 = 0;

	����:
	while (true) {
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�                  ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		menu = scan.nextInt();

		
		switch(menu) {
		
		//input the grade
		case 1: 
			System.out.println("����������������������������������������������������������");
			System.out.println("��           ����  �Է�                 ��");
			System.out.println("����������������������������������������������������������");
			System.out.println();

			
			do {
				System.out.printf("����1 : ");
				kor1 = scan.nextInt();

				if (kor1 < 0 || 100 < kor1)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kor1 < 0 || 100 < kor1);
			
			do {
				System.out.printf("����2 : ");
				kor2 = scan.nextInt();

				if (kor2 < 0 || 100 < kor2)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kor2 < 0 || 100 < kor2);
			
			
			do {
				System.out.printf("����3 : ");
				kor3 = scan.nextInt();

				if (kor3 < 0 || 100 < kor3)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kor3 < 0 || 100 < kor3);

			System.out.println("����������������������������������������������������������");
			
		case 2:
		
		//print grade
			
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f;

			System.out.println("����������������������������������������������������������");
			System.out.println("��           ����  ���                   ��");
			System.out.println("����������������������������������������������������������");
			System.out.println();

			
			for (int i = 0; i < 3; i++) {
				System.out.printf("\t���� %d : %3d\n", i+1, kor1);
			}

			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������������������������������");

		case 3:
			break ����;
	
		
		default:
			System.out.println("�Է� ���� 1~3������ �Է��� �� �ֽ��ϴ�");
	  }
	}
	
	System.out.println("good bye~");

  }
}

