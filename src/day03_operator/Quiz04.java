package day03_operator;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num1,num2;
		
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		String s = (num % 2 == 0)?"¦��":"Ȧ��";
		System.out.println(num + " = " + s);
		s = (num % 2 == 1)?"3�ǹ��":"3�� ����� �ƴϴ�";
		System.out.println(num + " = " + s);
		
		System.out.print("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("num1 : " + num1 + ",num2 : " + num2);
		String	s1 = (num1 > num2)?"num1�� num2���� ũ��":"num1�� num2���� �۴�";
		System.out.println(s1);
	
	}
}
