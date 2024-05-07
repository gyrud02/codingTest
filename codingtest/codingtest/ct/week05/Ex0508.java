package codingtest.ct.week05;

import java.util.Scanner;

public class Ex0508 {

	public static void main(String[] args) {
	
		// 버블정렬
		// - 한번에 바꾸는 것을 패스(Pass)라고 한다.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("버블정렬 전");
		System.out.print("개수 : ");
		
		int n = sc.nextInt();
		int x[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println(String.format("x[%d]", i));
			x[i] = sc.nextInt();
		}
		
		
		// 버블정렬 실행
		bubbleSort(x, n);
		
		
		System.out.println("버블정렬 후 : ");
		
		for(int i=0; i<n; i++) {
			System.out.println(String.format("x[%d] = %d", i, x[i]));
		}
		
	}

	// 버블정렬 함수
	static void bubbleSort(int a[], int n) {

		for(int i=0; i < a.length -1 ; i++) {
		
			for(int j= i+1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					
					swap(a, i, j);
				}
			}
		}
	}

	// 교환 함수
	static void swap(int a[], int n, int m) {
		
		int temp = a[n];
		
		a[n] = a[m];
		a[m] = temp;
	}
	
}
