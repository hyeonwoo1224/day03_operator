package day03_operator;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3;
		// 입력한 데이터가 3의 배수인 경우 출력
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		if(n1 % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		// 입력한 수의 절대값을 구하는 프로그램
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		if(n1 < 0) {
			System.out.println(n1+"의 절댓값은" +n1*-1+"입니다.");
		}
		// 두 수를 입력 받아 큰 수를 출력
		System.out.print("두 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1 > n2) {
			System.out.println("n1이 n2보다 더 큽니다");
		}
		if(n2 > n1) {
			System.out.println("n2가 n1보다 더 큽니다");
		}
		// 세 수를 입력 받아 큰 수를 출력
		System.out.print("세 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1이 가장 큽니다");
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println("n2가 가장 큽니다");
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println("n3가 가장 큽니다");
		}
		// 두 수를 입력 받아 큰 수가 짝수이면 출력
		System.out.print("두 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1 > n2 && n1 % 2 == 0) {
			System.out.println("n1이 n2보다 더 크며 짝수입니다");
		}
		if(n2 > n1 && n2 % 2 == 0) {
			System.out.println("n2가 n1보다 더 크며 짝수입니다");
		}
		// 두 수를 입력 받아 합이 짝수이고, 3의 배수인 경우 출력
		System.out.print("두 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = n1 + n2;
		if(sum % 2 == 0 && sum % 3 == 0) {
			System.out.println("합이 짝수이고 3의 배수 입니다");
		}
	}
}
