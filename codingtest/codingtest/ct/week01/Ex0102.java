package codingtest.ct.week01;

public class Ex0102 {

	 public static void main(String[] args) {

		 // 정수 자료형
		 byte b = 0;				// 1byte: 8bit
		 char c = 'A', c1 = 65;		// 2byte: 16bit => 아스키코드 참고
		 short s = 1000;			// 2byte
		 int i = 65;				// 4byte
		 long l = 1000000000000000L;// 8byte, long타입은 변수 값 대입 시 대문자 L입력 => int로 인식하기 때문
		 
		 // 실수 자료형
		 float f = 3.141592F;		// 4byte, float타입은 변수 값 대입 시 대문자 F입력 => double로 인식하기 때문
		 double d = 3.141592;		// 8byte
		 
		 // 논리 자료형
		 boolean t = false;
	}
	
}
