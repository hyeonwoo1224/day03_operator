package day03_operator;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3;
		// �Է��� �����Ͱ� 3�� ����� ��� ���
		System.out.print("�� �Է� : ");
		n1 = input.nextInt();
		if(n1 % 3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");
		}
		// �Է��� ���� ���밪�� ���ϴ� ���α׷�
		System.out.print("�� �Է� : ");
		n1 = input.nextInt();
		if(n1 < 0) {
			System.out.println(n1+"�� ������" +n1*-1+"�Դϴ�.");
		}
		// �� ���� �Է� �޾� ū ���� ���
		System.out.print("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1 > n2) {
			System.out.println("n1�� n2���� �� Ů�ϴ�");
		}
		if(n2 > n1) {
			System.out.println("n2�� n1���� �� Ů�ϴ�");
		}
		// �� ���� �Է� �޾� ū ���� ���
		System.out.print("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1�� ���� Ů�ϴ�");
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println("n2�� ���� Ů�ϴ�");
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println("n3�� ���� Ů�ϴ�");
		}
		// �� ���� �Է� �޾� ū ���� ¦���̸� ���
		System.out.print("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1 > n2 && n1 % 2 == 0) {
			System.out.println("n1�� n2���� �� ũ�� ¦���Դϴ�");
		}
		if(n2 > n1 && n2 % 2 == 0) {
			System.out.println("n2�� n1���� �� ũ�� ¦���Դϴ�");
		}
		// �� ���� �Է� �޾� ���� ¦���̰�, 3�� ����� ��� ���
		System.out.print("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = n1 + n2;
		if(sum % 2 == 0 && sum % 3 == 0) {
			System.out.println("���� ¦���̰� 3�� ��� �Դϴ�");
		}
	}
}
