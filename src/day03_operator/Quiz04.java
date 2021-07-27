package day03_operator;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num1,num2;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		String s = (num % 2 == 0)?"짝수":"홀수";
		System.out.println(num + " = " + s);
		s = (num % 2 == 1)?"3의배수":"3의 배수가 아니다";
		System.out.println(num + " = " + s);
		
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("num1 : " + num1 + ",num2 : " + num2);
		String	s1 = (num1 > num2)?"num1이 num2보다 크다":"num1이 num2보다 작다";
		System.out.println(s1);
	
	}
}
