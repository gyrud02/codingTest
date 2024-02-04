package codingtest.ct.week01;

public class Ex0115 {

	public static void main(String[] args) {
		
		// 비교(equals)
		String str1 = "aaa";
		String str2 = "aaa";
		
		System.out.println("> str1.equals(str2) : " + str1.equals(str2));
		System.out.println("> str1 == str2 : " + str1 == str2);

		String str3 = new String("aaa");
		String str4 = new String("aaa");
		
		System.out.println("> str3 == str4 : " + str3 == str4);
		System.out.println("> str1 == str4 : " + str1 == str4);
		System.out.println("> str1.equals(str3) : " + str1.equals(str3));
		
		// == 는 값과 메모리 주소(위치)가 같아야 한다.
		// equals()는 메모리 주소 상관없이 값만 비교한다.
		// 객체(new) 생성 시 HEAP으로 쌓이면서 같은 값을 중복으로 쌓지 않는다.
		// 문자열은 equals()를 사용하여 값을 비교하며 그 외에 숫자 등은 "==" 으로 비교한다.
		
	}
}
