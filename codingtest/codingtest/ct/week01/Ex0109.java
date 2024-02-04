package codingtest.ct.week01;

public class Ex0109 {

	public static void main(String[] args) {
		
		// 라벨 break문
		ep:
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) {
					break ep; // break를 만나면 ep(라벨)이 있는 곳으로 돌아간다.
				}
				System.out.println(">> i : " + i);
			}
		}
		
	}

}
