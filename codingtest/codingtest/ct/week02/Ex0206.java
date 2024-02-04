package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0206 {

	public static void main(String[] args) {

		// 3. 링크드리스트(LinkedList)
		// - LinkedList는 List의 구현 클래스이므로 ArrayList와 사용방법은 같지만 내부 구조는 완전히 다르다
		// - ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만 
		//   LinkedList는 인접 참조를 링크해서 체인처럼 관리한다.

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
	
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		// * 형변환(캐스팅)
		// (int) a + b : 같은 숫자일 경우
		// String.valueOf()
		// parseInt();
		
		endTime = System.nanoTime();
		System.out.println("> ArrayList 걸린 시간 : " + (endTime - startTime) + "ms");
		
		/////////////////////////////////////////////////////////////////////////////
		
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("> LinkedList 걸린 시간 : " + (endTime - startTime) + "ms");
		
	}
}