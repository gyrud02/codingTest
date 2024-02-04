package codingtest.ct.week01;

public class Ex0107 {

	public static void main(String[] args) {

		// 조건문과 반복문
		// 2. 반복문
		//	2) while문: 조건이 맞을 때까지 무한 반복
//		int i = 10;
		
//		while(i > 10) {
//			System.out.println(">> i : " + i);
//		} // 조건이 맞지 않아 출력되지 않음
 		
//		int index = 0;
//		while(index < 10) {
//			System.out.println(">> 숫자 = " + index);
//			index++;
//		} // 무한 반복으로 출력
	
		// do ~ while문
		int index = 1;
		do {
			
			System.out.println(">> do 실행, index : " + index);
			index++;
			
		}while(index > 10); // 조건이 맞으면 do 문법 안에 내용을 실행하라
	}
}
