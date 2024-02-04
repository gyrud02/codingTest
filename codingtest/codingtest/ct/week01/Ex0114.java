package codingtest.ct.week01;

public class Ex0114 {

	public static void main(String[] args) {
		
		// 문자열 치환 방법
		String str = "Good Morning";
		
		System.out.println("> charAt : " + str.charAt(7));
		System.out.println("> startsWith : " + str.startsWith("good")); // startsWith(): 대/소문자 구분한다.
		System.out.println("> endsWith : " + str.endsWith("ng"));		// endsWith(): 문자열 끝에 포함된 문자로 끝나는지 확인한다.
		System.out.println("> equals : " + str.equals("good morning"));	// equals(): 문자열과 동일한 지 확인한다. 대/소문자 구분한다.
		System.out.println("> indexOf : " + str.indexOf("n"));			// indexOf(): 앞에서 해당하는 값을 찾아서 첫번째 인덱스 번호를 리턴한다.
		System.out.println("> lastIndexOf : " + str.lastIndexOf("n"));	// lastIndexOf(): 뒤에서 해당하는 값을 찾아서 첫번째 인덱스 번호를 리턴한다.
		System.out.println("> length : " + str.length());				// length: 길이
		
		System.out.println("> replace : " + str.replace("Good", "Bad"));		// replace: 해당하는 앞에 매개변수를 뒤에 매개변수 값으로 치환한다.
		System.out.println("> replace : " + str.replace("o", "a"));				// replace: 값이 존재하지 않으면 변경하지 않는다.
		System.out.println("> replaceAll : " + str.replaceAll("Good", "a"));	// replaceAll: 해당하는 앞에 매개변수를 뒤에 매개변수 값으로 치환한다.
		System.out.println("> replaceAll : " + str.replaceAll("[Good]", "a"));	// replaceAll: [] 정규식 안에 해당되는 값을 모두 뒤의 매개변수 값으로 치환한다.
	}
}
