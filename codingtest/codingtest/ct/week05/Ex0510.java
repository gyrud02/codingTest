package codingtest.ct.week05;

public class Ex0510 {

	public static void main(String[] args) {
		
		// 버블정렬
		
		int n = 7;
		int x[] = {1,3,9,4,7,8,6};
		
		bubbleSort(x);
	}
	
	// 버블정렬 함수
	static void bubbleSort(int a[]) {
		
		// 비교 횟수
		int comp = 0;
		
		// 교환 횟수
		int exchange = 0;

		// 패스
		for(int i=0; i < a.length -1 ; i++) {
		
			// 각 패스를 반복하면서 비교를 할 때마다 비교할 값 유무
			int cnt = 0;
			
			System.out.println("패스 : " + (i+1));
			
			// 비교
			// Ex0508과 다르게 뒤에서부터 비교한다.
			for(int j = a.length - 1; j > i; j--) {
				
				// 교환
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					cnt++;
					exchange++;
				}
				
				for(int k=0; k < a.length; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
				comp++;
			}
			
			if(cnt == 0) break;
		}
		
		System.out.println("비교횟수 : " + comp);
		System.out.println("교환횟수 : " + exchange);
	}

	// 교환 함수
	static void swap(int a[], int n, int m) {
		
		int temp = a[n];
		
		a[n] = a[m];
		a[m] = temp;
	}
	
}
