package part1.ex5.narray;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
	
	int[] kors = new int[3*3];
	int total = 0;
	float avg = 0;
	int menu;

	Scanner scan = new Scanner(System.in);
	
	for(int j=0; j<3; j++)
		for(int i=0; i<3; i++) 
			kors[3*j + i] = 0;

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

			for(int j=0; j<3; j++)
				for(int i=0; i<3; i++)
					do {
						System.out.printf("%d�г� ����%d : ", j+1, i+1);
						kors[3*j + i] = scan.nextInt();
		
						if (kors[3*j + i] < 0 || 100 < kors[3*j + i])
							System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
		
				} while (kors[3*j + i] < 0 || 100 < kors[3*j + i]);
					
			System.out.println("����������������������������������������������������������");
			
			break;
			
		case 2:
		
		//print grade

			System.out.println("����������������������������������������������������������");
			System.out.println("��           ����  ���                   ��");
			System.out.println("����������������������������������������������������������");
			System.out.println();

			for(int j=0; j<3; j++) {
				
				System.out.printf("<%d�г� �����>-----------------\n", j+1);
				
					for (int i = 0; i < 3; i++) {
						System.out.printf("\t%d�г� ���� %d : %3d\n", j+1 ,i+1, kors[3*j + i]);			
					}
					
				total = kors[3*j + 0] + kors[3*j + 1] + kors[3*j + 2];
				avg = total / 3.0f;
				
				System.out.printf("\t���� : %3d\n", total);
				System.out.printf("\t��� : %6.2f\n", avg);
				System.out.println("����������������������������������������������������������");
			}  
					
			
			break;
		case 3:
			break ����;
	
		
		default:
			System.out.println("�Է� ���� 1~3������ �Է��� �� �ֽ��ϴ�");
	  }
	}
	
	System.out.println("good bye~");

  }
}
