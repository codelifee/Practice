package part1.ex4.array;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
	
	int[] kors = new int[3];
	int total;
	float avg;
	int menu;

	Scanner scan = new Scanner(System.in);
	
	for(int i=0; i<3; i++) 
		kors[i] = 0;

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

			for(int i=0; i<3; i++)
			do {
				System.out.printf("����%d : ", i+1);
				kors[i] = scan.nextInt();

				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kors[i] < 0 || 100 < kors[i]);
					
			System.out.println("����������������������������������������������������������");
			
		case 2:
		
		//print grade
			
			total = kors[0] + kors[1] + kors[2];
			avg = total / 3.0f;

			System.out.println("����������������������������������������������������������");
			System.out.println("��           ����  ���                   ��");
			System.out.println("����������������������������������������������������������");
			System.out.println();

			
			for (int i = 0; i < 3; i++) {
				System.out.printf("\t���� %d : %3d\n", i+1, kors[i]);
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
