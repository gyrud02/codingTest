package codingtest.ct.week04;

import java.util.Arrays;
import java.util.Stack;

public class Ex0401 {

	public static void main(String[] args) {

		// Stack
		// - stack 인터페이스는 LIFO 자료구조에서 사용되는 메소드를 정의한다.
		// - push: 주어진 객체를 스택에 넣는다.
		// - E peek(): 객체 하나를 가져온다. 객체를 스택에서 제거하지 않는다.
		// - E pop(): 객체 하나를 가져온다. 객체를 스택에서 제거한다.

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		System.out.println(stack.toString());
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();							// LIFO 자료구조이므로 제일 마지막에 들어간 값을 제거한다.
		
		System.out.println(stack.toString());	// 콘솔: [1, 2, 3, 4] -> 리스트 형식으로 들어간 걸 알 수 있다.
		
		System.out.println(stack.peek());		// 객체 하나를 가져온다. 객체를 스택에서 제거하지 않는다. -> 제일 뒤에 있는 값을 보여준다.
		
		System.out.println(stack.isEmpty());	// 객체가 비어있는지 확인하는 함수이다. true 혹은 false로 값을 나타낸다.
		
		System.out.println(stack.search(4));	// 찾는 값이 없다면 -1를 나타내고 인덱스가 아닌 위에서부터 4번째 순서의 값을 찾는다
		System.out.println(stack.search(2));
		
		System.out.println(stack.contains(2));	// 해당하는 문자열이 포함 유무에 대한 값을 찾는 함수이다. true 혹은 false로 값을 나타낸다.
		
		System.out.println(stack.containsAll(Arrays.asList(1,2,3)));	// 원하는 모든 값이 객체 안에 포함되는지 확인하는 함수이다. true 혹은 false로 값을 나타낸다.
		
		System.out.println(stack.size());		// 객체의 길이를 구하는 함수이다.
	}
}
