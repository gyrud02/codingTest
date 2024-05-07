package codingtest.ct.week05;

public class Ex0512 {

	public static void main(String[] args) {
		
		// 단순 선택정렬
		// - 가장 작은 요소를 맨 앞으로 이동하고, 두 번째 작은 요소는 맨 앞에서 두 번째로 이동하는 등의 작업을 반복하는 알고리즘
		// - 최소값은 현재 위치에 있는 숫자이다.
		
		int x[] = {6,4,8,3,1,9,7};

		seletionSort(x);
	}
	
	// 단순 선택정렬 함수
	static void seletionSort(int a[]) {
		
		for(int i=0; i<a.length-1; i++) {

			// 최소값
			int min = i;
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[j] < a[min]) {
					min = j;
				}// if
			}// for
			
			swap(a, i, min);
			
			for(int k=0; k<a.length; k++) {
				System.out.print(a[k] + " ");
			}
			
			System.out.println();
		}// for
	}
	
	// 교환 함수
	static void swap(int a[], int n, int m) {
		
		int temp = a[n];
		
		a[n] = a[m];
		a[m] = temp;
	}
}