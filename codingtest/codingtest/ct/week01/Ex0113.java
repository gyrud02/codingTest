package codingtest.ct.week01;

public class Ex0113 {

	public static void main(String[] args) {

		// 별로 삼각형 만들기
		// 1. 행의 수만큼 반복한다.
		// 2. 열의 수만큼 반복한다.
		
		// *
		// **
		// ***
		// ****
		// *****
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		/*for(int i=1; i<=5; i++) {
			
			// 공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}

			// * 찍기
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		// *****
		// ****
		// ***
		// **
		// *
		/*for(int i=5; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		// *****
		//  ****
		//   ***
		//    **
		//     *
		/*for(int i=5; i>=1; i--) {
			
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		/*for(int i=1; i<=5; i++) {
			
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		/*for(int i=5; i>=1; i--) {
			
			for(int j=0; j<=5-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
 	}
}
