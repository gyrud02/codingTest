package codingtest.ct.week01;

public class Ex0108 {

	public static void main(String[] args) {

		// 조건문과 반복문
		// 2. 반복문
		//	3) for ~ break문
		
		/*int i = 0;
		for(i = 0; i < 100; i++) {
			
			if(i == 50) {
				System.out.println("i가 50과 같다면 멈춤");
				break;
			}
			System.out.println(">> i : " + i);
		}*/
		
		// 이중 반복문 사용 시 break문 작동하지 않는다.
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) {
					break;
				}
				System.out.println(">> i : " + i);
			}
		}
		
	}
}
