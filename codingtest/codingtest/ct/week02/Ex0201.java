package codingtest.ct.week02;

import java.util.Scanner;

public class Ex0201 {

	public static void main(String[] args) {

		System.out.println("> 세 정수의 최대값을 구하세요!");
		
		Scanner sc = new Scanner(System.in);	
		// 출력값을 받을 때는 System.in
		// 출력값을 내보낼 때는 System.out
		
		System.out.println(">> A : ");
		int a = sc.nextInt();
		
		System.out.println(">> B : ");
		int b = sc.nextInt();
		
		System.out.println(">> C : ");
		int c = sc.nextInt();
		
		// 처음 값을 받는 a가 최소값이자 최대값이다.
		int max = a;

		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.printf("> 최대값 : %d", max);

	}

}
