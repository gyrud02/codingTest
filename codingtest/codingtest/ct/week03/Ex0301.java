package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex0301 {

	public static void main(String[] args) {

		// Queue
		// - Queue 인터페이스는 FIFO 자료구조에서 사용되는 메소드를 정의한다.
		// - Queue 인터페이스를 구현한 대표적인 클래스는 LinkedList이다.
		// - 함수
		//  -> peek(): 맨 처음 넣은 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다.
		//  -> poll(): 맨 처음 넣은 객체 하나를 가져온다. 객체를 큐에서 제거한다.
		//  -> offer(): 주어진 객체를 넣는다.
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		System.out.println(queue.toString());
		
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.toString());
		
		System.out.println(queue.peek());
		System.out.println(queue.toString());

		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		System.out.println(queue.isEmpty());	// 객체가 비었는지 확인
		
		queue.clear();							// 큐 안에 모든 객체를 지운다.
		System.out.println(queue.toString());
		
	}
}
