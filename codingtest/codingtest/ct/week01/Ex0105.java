package codingtest.ct.week01;

public class Ex0105 {

	public static void main(String[] args) {

		// 조건문과 반복문
		// 1. 조건문
		//  2) switch
		int i = 3;
		
		/*switch (i) {
			case 1:
				System.out.println("case 1: 1분기");
			case 2:
				System.out.println("case 2: 2분기");
			case 3:
				System.out.println("case 3: 3분기");
			case 4:
				System.out.println("case 4: 4분기");
			case 5:
				System.out.println("case 5: 5분기");
			default:
				System.out.println("알 수 없음");
		}*/
		
		// 위 내용을 콘솔로 확인할 경우 break가 없어서 해당하는 값부터 모두 작동한다.

		/*switch (i) {
		case 1:
			System.out.println("case 1: 1분기");
			break;
		case 2:
			System.out.println("case 2: 2분기");
			break;
		case 3:
			System.out.println("case 3: 3분기");
			break;
		case 4:
			System.out.println("case 4: 4분기");
			break;
		case 5:
			System.out.println("case 5: 5분기");
			break;
		default:
			System.out.println("알 수 없음");
			break;
		}*/
		
		char c = 'b';
		/*switch (c) {
			case 'a': 
				System.out.println("A");
				break;
			case 'b': 
				System.out.println("B");
				break;
			case 'c': 
				System.out.println("C");
				break;
		}*/
		
		String s = "A";
		switch (s) {
			case "A":
				System.out.println("A");
				break;
			case "B":
				System.out.println("B");
				break;
			case "C":
				System.out.println("C");
				break;
		}
	}
}
