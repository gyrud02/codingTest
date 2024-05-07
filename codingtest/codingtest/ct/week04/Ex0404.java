package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0404 {

	public static void main(String[] args) {

		// 스택: https://www.acmicpc.net/problem/10828
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();

		// 입력한 개수
		int n = sc.nextInt();
		 
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			// 문자를 받아야하므로 문자열 타입으로 받는다.
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str);

			// 공백을 기준으로 앞뒤를 자른다.
			String cmd = st.nextToken(); 
			
			switch (cmd) {
			case "push": {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
				break;
			}
			case "pop": {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			}
			case "size": {
				sb.append(stack.size()).append("\n");
				break;
			}
			case "empty": {
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			}
			case "top": {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			}
			default:
				break;
			} // switch
		} // for 
		
		System.out.println(sb.toString());
	}

}
