package codingtest.ct.week04;

import java.util.Scanner;

public class Ex0402 {

	public static void main(String[] args) {
		
		// 스택으로 배열 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 개수
		
		ArrayStack stack = new ArrayStack(n);
		
		while(true) {
			System.out.println(String.format("현재 수 : %d / %d", stack.size(), stack.capacity()));
			System.out.print("1.push, 2.pop, 3.peek, 4.clear, 5.dump, 0.종료");
			System.out.println();
			
			int num = sc.nextInt();
			if(num == 0) break;

			int x;	// 입력할 데이터
			
			switch (num) {
			case 1: {
				System.out.print("Push : ");
				x = sc.nextInt();
				stack.push(x);
				break;
			}
			case 2: {
				x = (int)stack.pop();
				System.out.println(String.format("Pop : %d", x));
				break;
			}
			case 3: {
				x = (int)stack.peek();
				System.out.println(String.format("Peek : %d", x));
				break;
			}
			case 4: {
				stack.clear();
				break;
			}
			case 5: {
				stack.dump();
				break;
			}
			default:
				break;
			}
			
		}
		
	}
	
}

class ArrayStack{
	
	private int top;		// 높이
	private int capacity;	// 용량
	private Object stack[];	// 스택(배열)
	
	// 생성자
	public ArrayStack(int max) {
		this.top = -1;
		this.capacity = max;
		stack = new Object[max];
	}
	
	public void push(Object obj) {
		
		// 스택 길이보다 많이 넣으면(넘치면) 넣지 않는다.
		if(isFull()) {
			System.out.println("Stack is Full!!");
		}else{
			stack[++top] = obj;
		}
		
	}
	
	public Object peek() {
		return stack[top];
	}
	
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return null;
		}else {
			Object obj = stack[top];
			stack[top] = null;
			--top;
			return obj;
		}
	}
	
	public void clear() {
		this.top = -1;
		stack = new Object[this.capacity];
	}

	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public boolean isFull() {
		return (this.top >= this.capacity - 1);
	}
	
	public int size() {
		return this.top + 1;
	}
	
	public int capacity() {
		return this.capacity;
	}

	public void dump() {
		
		for(Object obj:stack) {
			if(obj != null) {
				System.out.println(String.format("%s ", obj.toString()));
			}
		}
		System.out.println();
	}
}
