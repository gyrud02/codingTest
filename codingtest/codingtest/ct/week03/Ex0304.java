package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex0304 {

	public static void main(String[] args) {

		// 회전하는 큐: https://www.acmicpc.net/problem/2164 
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=num; i++) {
			queue.offer(i);
		}
		
		int m = s.nextInt();
		int arr[] = new int[m];
		
		for(int i=0; i<m; i++) {
			arr[i] = s.nextInt();
		}
		
		int cnt = 0;
		
		for(int t:arr) {
			int idx = queue.indexOf(t);
			int h = queue.size() / 2;

			if(idx < h) {
				while(t != queue.getFirst()) {
					queue.addLast(queue.removeFirst());
					cnt++;
				}
			}else {
				while(t != queue.getFirst()) {
					queue.addFirst(queue.removeLast());
					cnt++;
				}
			}
			queue.pollFirst();
		} // for
		
		System.out.println(cnt);
	}
}
