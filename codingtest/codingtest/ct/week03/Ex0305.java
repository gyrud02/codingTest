package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0305 {

	public static void main(String[] args) {

		// 카드1: https://www.acmicpc.net/problem/2161 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
	
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}

		while(queue.size() > 1) {
			System.out.print(queue.poll() + " ");
			queue.offer(queue.poll());
		}

		System.out.println(queue.poll());
	}
}
