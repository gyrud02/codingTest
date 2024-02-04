package codingtest.ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex0207 {

	public static void main(String[] args) {

		// 4. 셋(Set)
		// - List 컬렉션은 저장 순서를 유지하지만 Set 컬렉션은 저장순서가 유지되지 않는다.
		// - 객체를 중복 저장할 수 없고, 하나의 NULL만 저장할 수 있다.
		// - add(index, endindex) 사용불가: 인덱스가 없기 때문에
		// - set 메소드도 따로 없다. 값을 중복으로 저장할 수 없기 때문에 add로 처리한다.
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("c");

		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		
		// hasNext() : 다음이 있을 때까지 반복문을 작동한다.
		while(iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
			System.out.println("> 출력방법 1번 : " + iterator.next());
		}
		
		set.add("A");
		
		for(String str: set) {
			System.out.println("> 출력방법 2번 : " + str);
		}
		
	}
}