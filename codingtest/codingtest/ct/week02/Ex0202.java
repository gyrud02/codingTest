package codingtest.ct.week02;

public class Ex0202 {

	public static void main(String[] args) {

		// 최대값 구하기1
		System.out.println(MaxMin.max(1, 2, 3));
		System.out.println(MaxMin.max(10, 2, 3));
		System.out.println(MaxMin.max(10, 20, 3));
		
		// 최대값 구하기2 - 배열/리스트
//		int a[] = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4};
		int a[] = {};
		System.out.println(MaxMin.max(a));
	
		// 최대값과 최소값 동시에 구하기
		System.out.println(MaxMin.maxmin(a)[0]);
	}
}

class MaxMin{
	
	// 최대값 구하기 함수
	static int max(int a, int b, int c) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;

		return max;
	}
	
	
	// 최대값 구하기 함수2
	static int max(int[] arr) {
		
		// 값이 없을 때 오류가 발생하므로 리턴값을 임의로 지정해준다.
		//if(arr.length <= 0) return 0;
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		
		return max;
	}
	
	// 최소값 구하기 함수
	static int min(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	// 최대값과 최소값 동시에 구하기
	static int[] maxmin(int[] arr) {
		
		int mm[] = new int[2];
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}

		mm[0] = max;
		mm[1] = min;
		
		return mm;
	}
	
}

