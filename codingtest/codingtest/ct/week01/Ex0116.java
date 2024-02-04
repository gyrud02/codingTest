package codingtest.ct.week01;

public class Ex0116 {

	public static void main(String[] args) {
		
		// 배열
		// 1. 1차원 배열
		//  1) 선언
		// byte ~ int의 기본값은 0으로 선언된다.
		// long은 0L로 기본값이 선언된다.
		// float은 0.0F로 기본값이 선언된다.
		// double은 0.0으로 기본값이 선언된다.
		// boolean은 false가 기본값으로 선언된다.
		// String같은 클래스나 오브젝트들은 null로 선언된다.
		
		int[] a;	// 자료형 앞에 대괄호를 붙여 선언하는 방법
		int b[];	// 변수명 뒤에 대괄호를 붙여 선언하는 방법
		
		// 2) 초기화
		// - 중괄호를 열고 닫는다.
		// - 배열은 배열 안에 값 수정은 가능하다. 그러나 삭제는 할 수 없다.
//		char[] c = {};
		char[] c = {'A', 'B', 'C'};
		int d[] = new int[3];

		// 3) 배열 값 확인하기
		System.out.println(c[0]); // A
		System.out.println(c[1]); // B
		System.out.println(c[2]); // C
		
		// 4) 배열에 값 추가하기
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		
		System.out.println(d[0]); // 1
		System.out.println(d[1]); // 2
		System.out.println(d[2]); // 3
		
		// 중괄호의 값을 대괄호에 대입된다. 대괄호는 float[3]이 자동으로 적용된다.
		float f[] = new float[] {1.2F, 2.3F, 3.4F};
		System.out.println(f[2]); // 3.4
		
		f[2] = 4.3F;
		System.out.println(f[2]); // 4.3
		
		// 배열 값 추가하기
		int[] score = new int[10];
		
		score[0] = 1;				// 배열에 직접 값 추가하기
		System.out.println(score[0]);
		
		for(int i=0; i<10; i++) {	// 반복문을 사용하여 값 추가하기
			score[i] = i+1;
			System.out.println(score[i]);
		}
		
		// 참고) 공공기관 변수 선언 방법
		int sum;
		sum = 0;
		
		// length와 length()의 차이
		// - 속성과 메소드의 차이이다. 클래스의 경우 length() 메소드를 사용한다.
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
	}
}
