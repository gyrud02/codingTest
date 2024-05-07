package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class Ex0403 {

	public static void main(String[] args) {
		
		// 스택 수열: https://www.acmicpc.net/problem/1874
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack();
		
		// 입력을 받을 개수
		int n = sc.nextInt();
		int top = 0;
		
		while(n > 0) {
			
			// 입력할 데이터
			int m = sc.nextInt();
			
			if(m > top) {
				
				for(int i = top + 1; i <= m; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				top = m;
			}else if(stack.peek() != m) {
				System.out.println("NO");
//				sb.append("NO").append("\n");
//				break;
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
			n--;
		}

		System.out.println(sb.toString());
	}
	
}
