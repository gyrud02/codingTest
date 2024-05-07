package codingtest.ct.week03;

import java.util.ArrayList;
import java.util.List;

public class codingTestPrac {

	public static void main(String[] args) {
		
		/*int[] numbers = {10, 20, 30, 5, 5, 20, 5};
		int answer = 0;
        
        // numbers 값을 모두 가져올 수 있도록 반복
        for(int i=1; i<numbers.length; i++){
            
        	System.out.println("i : " + i);

        	// 반복하면서 비교
            for(int j=i+1; j<numbers.length; j++){
            	
            	System.out.println("j : " + j);
            	
                if(answer < numbers[i] * numbers[j]){
                    answer = numbers[i] * numbers[j];
                    System.out.println("answer : " + answer);
                }
            }
            
        }*/
		
		/*String polynomial = "3x + 7 + x";
		String answer = "";
        int x = 0, n = 0;
        
        String[] splitList = polynomial.split(" \\+ ");
        
        for(int i=0; i<splitList.length; i++) {
        	
        	// x가 포함되는지 비교
        	if(splitList[i].contains("x")) {
        		
        		// x만 있으면 공백을 주고 nx에 x만 있는 개수만큼 더한다
        		x += splitList[i].equals("x") ? 1: Integer.parseInt(splitList[i].replace("x", ""));
        		
        	}else {
        		// 숫자만 있으면 n에 숫자만 넣는다.
        		n += Integer.parseInt(splitList[i]);
        	}
        }
        
        // answer에 문자열 넣기
        if(x == 1) {
        	answer = "x";
        }else if(x > 1) {
        	answer = x + "x";
        }
        
        if(x == 0 && n > 0) {
        	answer = String.valueOf(n);
        }else if(x > 0 && n > 0) {
        	answer += " + " + n;
        }*/
		
		/*int answer = 0;
		String my_string = "aAb1B2cC34oOp";
		String arr = my_string.replaceAll("[^0-9]", " ");
		String[] arr2 = arr.split(" ");
		
		for(int i=0; i<arr2.length; i++) {
			if(!arr2[i].equals("")) answer += Integer.parseInt(arr2[i]);
		}*/
		
		
		// https://school.programmers.co.kr/learn/courses/30/lessons/120866?language=java
		int answer = 0;
//		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
		
		int x[] = {};
        int y[] = {};
        
        int bomb = 0;		// 폭탄 개수
        int cnt = 0;		// 안전지대
        int dangerArea = 0;	// 위험지대
        
        ArrayList<int[]> b = new ArrayList<>();
        
        /* --------------------------------------------------- */
        // 1. 폭탄 개수 구하기: 지뢰가 있는 지역 1과 지뢰가 없는 지역 0
        // 배열의 첫번째 열 길이만큼 반복
        for(int i=0; i<board.length; i++){
        	// 배열의 두번째 열 길이만큼 반복
            for(int j=0; j<board.length; j++){

            	// 만약 배열안에 1값이 있다면 폭탄이므로 폭탄의 개수를 더한다
            	if(board[i][j] == 1) {
            		bomb++;
            	}
            }
        }
        
        // 폭탄의 개수
        System.out.println(bomb);
        
        // 2. 안전지역 개수 구하기
        // 배열의 첫번째 열 길이만큼 반복
        for(int i=0; i<board.length; i++) {
        	// 배열의 두번째 열 길이만큼 반복
        	for(int j=0; j<board.length; j++) {
        		
        		// 만약 배열안에 0값이 있다면 안전지대이므로 안전지대의 개수를 더한다
        		if(board[i][j] == 0) {
        			 cnt++;
        		}

        		// 3. 위험지대 구하기
        		if(board[i][j] == 0) {
        		}
        	
        	}
        }
        
        // 안전지대의 개수
        System.out.println(cnt);
        
        
        
        // 위험지대 개수
        System.out.println(dangerArea);
        /* --------------------------------------------------- */
        
        
        
        
        /* 선생님 --------------------------------------------------- */
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[i].length; j++) {
        		if(board[i][j] == 1) {
        			int[] temp = {i,j};
        			b.add(temp);
        		}
        	}
        }
        
        for(int i=0; i<b.size(); i++) {
        	int m = b.get(i)[0];
        	int n = b.get(i)[1];
        }
        /* 선생님 --------------------------------------------------- */
        
	}
}