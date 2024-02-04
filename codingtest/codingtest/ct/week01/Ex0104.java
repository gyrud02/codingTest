package codingtest.ct.week01;

public class Ex0104 {

	public static void main(String[] args) {

		// 조건문과 반복문
		// 1. 조건문
		//  1) if
		int i = 88;
		
		// 중괄호는 실행이 두 개 이상일 때, 중괄호가 없는 경우 하나만 실행한다
		if(i >= 90) System.out.println("A");
		else if(i >= 80) System.out.println("B");
		else if(i >= 70) System.out.println("C");
		else if(i >= 60) System.out.println("D");
		else {
			System.out.println("F");
			System.out.println("낙제");
		}
	}
}
