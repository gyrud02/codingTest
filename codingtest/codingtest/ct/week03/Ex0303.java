package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0303 {

	public static void main(String[] args) {

		// 카드2: https://www.acmicpc.net/problem/2164 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		/*for(int i=1; i<=n; i++) {
			queue.offer(i);
		}

		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		
		System.out.println("결과값: " + queue.poll());*/	
		
	}
}
