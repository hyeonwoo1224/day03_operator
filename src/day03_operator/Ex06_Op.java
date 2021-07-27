package day03_operator;

public class Ex06_Op {
	public static void main(String[] args) {
		/*
		 ++ : 자기 자신을 1 증가시킨다
		 -- : 자기 자신을 1 감소시킨다
		 - a = a - 1, a = a + 1
		 */
		int su1 = 5;
		su1++;	// 후치 또는 후위
		System.out.println(su1);
		++su1;	// 전치 또는 전위
		System.out.println(su1);
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;
		n1 = 10;
		n3 = n1++;
		System.out.println(n2);
		System.out.println(n3);
	}
}
