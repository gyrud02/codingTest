package codingtest.ct.week01;

public class Ex0106 {

	public static void main(String[] args) {

		// 조건문과 반복문
		// 2. 반복문
		//  1) for문
//		for (int i = 0; i < 10; i++) { // 단항 후위
//			System.out.println(">> i : " + i);
//		}

//		for (int i = 0; i < 10; ++i) { // 단항 전위: 작업이 끝난 후 올려준다.
//			System.out.println(">> i : " + i);
//		}
		
		// 전위와 후위의 값은 동일하게 나타난다.


//		for (int i = 0; i < 10; i += 2) {
//			System.out.println(">> i : " + i);
//		}
		
		
		// 문자열 배열 출력하기
		String[] arrays = {"a", "b", "c", "d", "e"};

//		for (int i = 0; i < arrays.length; i++) {
//			System.out.println("arrays 1 : " + arrays[i]);
//		}
		
		// 모두 Object 일 때 사용하는 반복문
//		for (String s: arrays) {
//			System.out.println("arrays 2 : " + s);
//		}
		
		
		// 정수 배열 출력하기
		int[] numbers = {1,2,3,4,5};
//		for(int i = 0; i < numbers.length; i++) System.out.println(">> numbers : " + numbers[i]);
		
//		for(int number: numbers) System.out.println(">> numbers : " + number);
		
	}
}
