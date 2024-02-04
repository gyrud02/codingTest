package codingtest.ct.week01;

public class Ex0103 {

	public static void main(String[] args) {

		// 변수 선언 & 대입
		int i = 10, j = 20;
		int k = -8;
		
		int a = i + j;	// 덧셈
		int b = i - j;	// 뺄셈
		int c = i * j;	// 곱셈
		int d = i / j;	// 나눗셈
		int e = i % j;	// 나머지

		// 출력
//		System.out.println(">> a : " + a);
//		System.out.println(">> b : " + b);
//		System.out.println(">> c : " + c);
//		System.out.println(">> d : " + d);
//		System.out.println(">> e : " + e);

		// 후위: 앞에 있는 값을 가져온다.
//		System.out.println(">> i++ : " + i++);
		
		// 전위: 계산 후의 값을 가져온다.
//		System.out.println(">> ++j : " + ++j);

		// 비트연산자 - 논리
//		System.out.println(i & j);
//		System.out.println(i | j);
		
		// 비트 연산자 - 비트 시프트
		// 왼쪽으로 세번 이동한다. 만약, 비어있다면 0으로 채워준다
//		System.out.println(k<<3);

		// 오른쪽으로 세번 이동한다. 만약, 비어있다면 0으로 채워준다
//		System.out.println(k>>3);
		
		/* 연산자 우선순위 */
		// 1. ., [], ()
		// 2. 산술, 시프트, 비교
		// 3. 비트, 논리
		
	}
}
