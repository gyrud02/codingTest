package codingtest.ct.week01;

public class Ex0110 {

	public static void main(String[] args) {
		
		// 조건문과 반복문
		// 2. 반복문
		//	4) continue문

		// 홀수만 출력해보자.
		for(int i=1; i<100; i++) {
			if(i % 2 == 0) continue;
			System.out.println(">> i : " + i);
		}
		
		// 짝수만 출력해보자.
		for(int i=1; i<100; i++) {
			if(i % 2 != 0) continue;
			System.out.println(">> i : " + i);
		}
	}
}
