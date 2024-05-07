package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex0307 {

	public static void main(String[] args) {

		// 프린터 큐: https://www.acmicpc.net/problem/1966
	
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();	// 테스트케이스의 수

		// 문서 개수만큼 반복하여 우선순위 받기
		for(int i=0; i<t; i++) {
			
			// 문서 수
			int doc = sc.nextInt();

			// 궁금한 문서의 인덱스 번호
			int idx = sc.nextInt();	

			// 큐에 우선순위 담기
			LinkedList<int[]> queue = new LinkedList<>();

			for(int j=0; j<doc; j++) {
				queue.offer(new int[] {j, sc.nextInt()});
			}
			
			// 출력 수
			int printCnt = 0;
			
			while(!queue.isEmpty()) {
				
				// 맨 앞의 큐 가져오기
				int[] front = queue.poll();

				// 가져온 큐는 무조건 최대값으로 지정
				boolean isMax = true;
				
				// 가져온 큐보다 큰 값이 있는지 확인한다(있으면 뒤로 보낸다)
				for(int k=0; k<queue.size(); k++) {
					if(front[1] < queue.get(k)[1]) {
						queue.offer(front); 
						isMax = false; 
						break;
					}
				}
				
				// 최대값이 아니면 반복문을 계속 실행한다.
				if(!isMax) continue;
				
				// 출력 수++
				printCnt++;
				
				// 큐의 배열번호와 인덱스 번호가 같다면 반복문을 종료한다.
				if(idx == front[0]) break;
			}
			
			// 테스트케이스 별로 출력 수를 담는다.
			sb.append(printCnt).append("\n");
		}
		
		// 전체 테스트케이스별 출력 수를 출력한다.
		System.out.println(sb.toString());
	}
}
