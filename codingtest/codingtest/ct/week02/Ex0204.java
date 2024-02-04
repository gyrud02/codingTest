package codingtest.ct.week02;

import java.util.Arrays;
import java.util.List;

public class Ex0204 {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("A", "B", "C");
		
		for(String s:list1) {
			System.out.println("> 리스트1+ 값 : " + s);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		
		for(Integer i:list2) {
			System.out.println("> 리스트2 값 : " + i);
		}
		
		
	}

}
