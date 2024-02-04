package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex0203 {

	public static void main(String[] args) {
	
		// 1. 리스트(List)
		List<String> list = new ArrayList<>();
		
		list.add("A");
		System.out.println(list.toString() + ", " + list.size());

		// 리스트는 stack에 포함되며, add() 사용 시 값이 뒤에 추가된다.
		list.add("B");
		list.add("D");
		System.out.println(list.toString() + ", " + list.size());
		
		// B와 D 사이에 C를 넣어보자.
		list.add(2, "C");
		System.out.println(list.toString() + ", " + list.size());
		
		list.add("F");
		System.out.println(list.toString() + ", " + list.size());

		// F를 수정한다.
		list.set(4, "E");
		System.out.println(list.toString() + ", " + list.size());
		
		// 인덱스 3번의 값을 가져온다.
		System.out.println(list.get(3));
		
		// 리스트의 전체 값을 출력한다.
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d 번째 문자 : %s\n", i, list.get(i));
		}
		
		// 리스트를 삭제한다.
		list.remove(1);
		System.out.println(list.toString() + ", " + list.size());
		
		list.remove("D");
		System.out.println(list.toString() + ", " + list.size());
		
		// 리스트의 전체 값을 출력한다.
		for(String s:list) {
			System.out.printf("문자 : %s\n", s);
		}
	}
}		