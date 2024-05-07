package codingtest.ct.week06;

import java.util.HashSet;
import java.util.Set;

/*
 * 랜덤 숫자 만들기
 * 중복 숫자 허용, 단, 연속은 안됨
 */

public class Ex0602 {

	public static void main(String[] args) {

		int[] arr1 = {1,3,4,5,7,9,6};
		int[] arr2 = {5,2,8,3,6};
		
		Set<Integer> set = new HashSet<>();
		
		// 교집합
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) set.add(arr1[i]);
			}
		}

		System.out.println(set.toString());
		
		// 합집합
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
		}
		
		System.out.println(set.toString());
		
		// 차집합(arr1-arr2)
		for(int j=0; j<arr2.length; j++) {
			set.remove(arr2[j]);
		}
		
		System.out.println(set.toString());
	}
}
