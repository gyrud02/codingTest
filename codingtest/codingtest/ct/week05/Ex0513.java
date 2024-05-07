package codingtest.ct.week05;

public class Ex0513 {

	public static void main(String[] args) {
		
		// 단순 삽입정렬
		// - 선택한 요소를 그보다 더 앞 쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘

		int x[] = {6,4,8,3,1,9,7};
		
		insertSort(x);
	}

	// 단순 삽입정렬 함수
	static void insertSort(int a[]) {
	
		// 선택정렬과 다르게 앞에서부터 비교한다.
		for(int i=1; i<a.length; i++) {
			
			int j;
			
			// 비교할 임시 변수
			int temp = a[i];
			
			for(j = i; j > 0 && a[j-1] > temp; j--) {
				a[j] = a[j-1];
			}
			
			a[j] = temp;
			
			for(int k=0; k<a.length; k++) {
				System.out.print(a[k] + " ");
			}
			
			System.out.println();
		}
	}
}