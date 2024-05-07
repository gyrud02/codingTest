package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0405 {

	public static void main(String[] args) {
	
		// 스택 2: https://www.acmicpc.net/problem/28278
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		/*
		1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
		2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
		3: 스택에 들어있는 정수의 개수를 출력한다.
		4: 스택이 비어있으면 1, 아니면 0을 출력한다.
		5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
		*/
		
		// 데이터 넣을 개수
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			
			// 정수가 있는지 확인할 변수
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int cmd = Integer.parseInt(st.nextToken());
			
			switch (cmd) {
			case 1: {
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			}
			case 2: {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			}
			case 3: {
				sb.append(stack.size()).append("\n");
				break;
			}
			case 4: {
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			}
			case 5: {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			}
			default:
				break;
			}//switch
			
		}//for
		
		System.out.println(sb.toString());
	}
}
