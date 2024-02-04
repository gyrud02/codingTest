package codingtest.ct.week01;

public class Ex0117 {

	public static void main(String[] args) {
		
		// 배열
		// 2. 다차원 배열
		//  1) 선언
		int[][] a;
		int b[][];
		int[] c[];

//		int[][][] a;		// 3차원 배열
//		int[][][][] a;		// 4차원 배열
		
		
		// 2) 초기화
		// - 앞의 []는 행, 뒤의 []는 열이다.
//		int d[][] = {{행}, {열}};
		int d[][] = {{1,2}, {3,4}};
		int e[][] = new int[][] {{5,6},{7,8}};	// 2행 2열
		int f[][] = new int[3][2];				// 3행 2열
		int g[][] = new int[3][];				// 3행 ?열: 열은 정해지지 않고 유동적으로 변경하여 사용할 수 있음

		// 3) 재선언
		g[0] = new int[5];						// 첫번째 행은 다섯개의 열을 가질 수 있다고 선언한다.
		g[1] = new int[3];
		g[2] = new int[1];
		g[0][0] = 0;
		g[2][3] = 3;							// 세번째 열을 지정하지 않았는데 값을 대입할 경우 오류가 발생한다.
		
	}
}
