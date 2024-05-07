package codingtest.ct.week06;

import java.util.Random;
import java.util.Stack;

/*
 * 랜덤 숫자 만들기
 * 중복 숫자 허용, 단, 연속은 안됨
 */

public class Ex0601 {

	public static void main(String[] args) {

		// 랜덤 숫자의 개수
		int n = 10;
		
		Stack<Integer> stack = new Stack<>(); 
		
		for(int i=0; i<=n; i++) {
			
			Random random = new Random();

			int t = random.nextInt(9);
			
			if(stack.isEmpty()) {
				stack.push(t);
			}else {
				if(stack.peek() != t) {
					stack.push(t);
				}
			}
		}
		System.out.println(stack.toString());
	}
}
