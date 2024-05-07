package codingtest.ct.week06;

import java.util.Arrays;
import java.util.Random;

public class codingTestPrac {

	public static void main(String[] args) throws Exception {
		
		// 2018 KAKAO BLIND RECRUITMENT
		// [1차] 다트 게임: https://school.programmers.co.kr/learn/courses/30/lessons/17682?language=java
		
//		String dartResult = "1S2D*3T";
/*		String dartResult = "1D2S#10S";
		int answer = 0;
		
		// dartResult 숫자 배열 변수
		int[] arr = new int[3];
		
		// dartResult 문자 변수
		String numStr = "";
		
		int idx = 0;
		
		// 반복문
		for(int i=0; i<dartResult.length(); i++) {

			// 문자(char) 읽어오기
			// S, D, T일 경우 각 게임 종료
			// *, #일 경우, 해당 게임에 옵션 값 X저장
			switch (dartResult.charAt(i)) {
			
			// S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화
			case 'S': {
				arr[idx] = (int) Math.pow(Integer.parseInt(numStr), 1);
				idx++;
				numStr = "";
				break;
			}
			
			// D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화
			case 'D': {
				arr[idx] = (int) Math.pow(Integer.parseInt(numStr), 2);
				idx++;
				numStr = "";
				break;
			}
			
			// T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화
			case 'T': {
				arr[idx] = (int) Math.pow(Integer.parseInt(numStr), 3);
				idx++;
				numStr = "";
				break;
			}
			
			// *인 경우는 자신과 이전의 점수 *2, idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2    
			case '*': {
				arr[idx-1] *= 2;
				if(idx > 1) arr[idx-2] *= 2;
				break;
			}
			// #은 자신의 점수를 음수로 만든다.
			case '#': {
				arr[idx-1] *= -1;
				break;
			}
			
			// 그 외의 정수들은 temp 변수에 저장해 둔다
			default:
				numStr += String.valueOf(dartResult.charAt(i));
				break;
			}
		}
		
		// 위 과정을 통해 구한 각 횟수의 점수를 모두 더하면 정답.
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
			System.out.println(arr[i]);
		}

		System.out.println("idx: " + idx);
		System.out.println("answer: " + answer);*/
		
		
		
		// 2018 KAKAO BLIND RECRUITMENT
		// [1차] 비밀지도: https://school.programmers.co.kr/learn/courses/30/lessons/17681

		/*int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		
		for(int i=0; i < arr1.length; i++) {
			
			// 2진수 계산 후 String
			String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
			
//			System.out.println(binary.length());
			System.out.println(binary);
			
			// 자릿수 String.format
			binary = "0".repeat(n - binary.length()) + binary;
			
			// Replace
			answer[i] = binary.replace("1", "#").replaceAll("0", " ");
			
		}*/
		
		
		// 2018 KAKAO BLIND RECRUITMENT
		// [1차] 소수 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12977
		
//		int[] nums = {1,2,3,4};
//		int[] nums = {1,2,7,6,4};
//		int answer = 0;
		
/*		for(int i=0; i<nums.length; i++) {
			
			// j는 i+1부터 nums 배열의 길이보다 작을 때까지 반복합니다. 
			// 이렇게 함으로써 중복되지 않는 숫자 조합을 선택할 수 있습니다.
			for(int j=i+1; j < nums.length; j++) {
				
				// k는 j+1부터 nums 배열의 길이보다 작을 때까지 반복합니다. 
				// 이 역시 중복되지 않는 숫자 조합을 선택하기 위한 루프입니다.
				for(int k=j+1; k < nums.length; k++) {
					
					int sum = nums[i] + nums[j] + nums[k];
					
					boolean check = true;
					
					for(int l=2; l<sum/2; l++) {
						
						//나누어 떨어지면 소수가 아니므로 false
						if(sum % l == 0) {
							check = false;
							break;
						}
						
					} // for l
					
					if(check) answer++;
				} // for k
			} // for j
		} // for i
*/		
		
		
//		System.out.println(answer);

		
		// 3진법 뒤집기: https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
		/*int n = 125;
		int answer = 0;
        
        String a = Integer.toString(n, 3);  // 3진법 만들기
        String b = "";
        
        for(int i=a.length()-1; i>=0; i--){
        	b += String.valueOf(a.charAt(i));
        }

        answer = Integer.parseInt(b, 3);*/
		
		
		
		// 2022 KAKAO TECH INTERNSHIP
		// 성격 유형 검사하기: https://school.programmers.co.kr/learn/courses/30/lessons/118666
		
		/*String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		String answer = "";
        
        // 질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey
        // 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices
        // choices의 길이 = survey의 길이
		
		char[] kakao = {'R','T','C','F','J','M','A','N'};
		int[] score = {0,3,2,1,0,1,2,3};
		HashMap<Character, Integer> map = new HashMap<>();
		
		// map 초기화
		for(char c:kakao) {
			map.put(c, 0);
		}
		
        for(int i=0; i<survey.length; i++){
            
        	char[] ch = survey[i].toCharArray();

        	if(choices[i] < 4) {
        		map.put(ch[0], map.get(ch[0])+score[choices[i]]);
        	}else if(choices[i] > 4){
        		map.put(ch[1], map.get(ch[1])+score[choices[i]]);
        	}
        }

        for(int i=0; i<kakao.length; i+=2) {
        	
        	if(map.get(kakao[i]) < map.get(kakao[i+1])) {
        		answer += kakao[i+1];
        	}else {
        		answer += kakao[i];
        	}
        }
        
        System.out.println(answer);
        System.out.println(map.toString());*/
		
		
		
		// 2021 KAKAO BLIND RECRUITMENT
		// 신규 아이디 추천: https://school.programmers.co.kr/learn/courses/30/lessons/72410

		
//		String new_id = "...!@BaT#*..y.abcdefghijklm";
//		String new_id = "z-+.^.";
/*		String new_id = "abcdefghijklmn.p";
		String answer = "";
		String append = "";

		// 1단계: new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		answer = new_id.toLowerCase();
		
		// 2단계: new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		answer = answer.replaceAll("[^-_.a-z0-9]", "");
		
		// 3단계: new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//		for(int i=0; i<substitutionText.length(); i++) {
//			substitutionText = substitutionText.replace("..", ".");
//		}

			// 3-1.
			while(answer.contains("..")) {
				answer = answer.replace("..", ".");
			}
			
			// 3-2.
			answer = answer.replaceAll("[.]{2,}", "");
		
		
		// 4단계: new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//		if(substitutionText.startsWith(".")){
//			substitutionText = substitutionText.replaceFirst(".", "");
//		}

			// 4-1.
			if(answer.startsWith(".")) {
				answer = answer.substring(1);
			}
			
			if(answer.endsWith(".")) {
				answer = answer.substring(0, answer.length()-1);
			}
			
			// 4-2.
			answer = answer.replaceAll("^[.]", "").replaceAll("[.]$", "");	
			// 정규식 안에 ^가 대괄호 앞일 경우 특정 문자로 시작할 때를 지칭한다.
			// 정규식 안에 $가 대괄호 뒤에 들어갈 경우 특정 문자로 끝이 날때를 지칭한다.
		
		// 5단계: new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//		if(substitutionText.length() <= 0) {
//			if(substitutionText.contains("")) substitutionText = substitutionText.replace("", "a");
//		}

		if(answer.equals("")) answer = "a";
			
		// 6단계: 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");	
		}
		
		// 7단계: new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if(answer.length() <= 2) {
			append = answer.substring(answer.length()-1, answer.length());
			
			while(answer.length() <= 2) {
				answer += append;
			}
		}
		
		System.out.println("마지막: " + answer);*/
		
		
		// 월간 코드 챌린지 시즌2
		// 음양 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/76501
		
		// 정수들의 절댓값을 차례대로 담은 정수 배열
		/*int[] absolutes = {4,7,12};
		
		// 정수들의 부호를 차례대로 담은 불리언 배열
		boolean[] signs = {true,false,true};
		
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			
			if(!signs[i]) {
				absolutes[i] = absolutes[i] * -1;
			}
			answer += absolutes[i];
		}

		System.out.println(answer);*/
		
		
		// 추억 점수: https://school.programmers.co.kr/learn/courses/30/lessons/176963
		
		// 그리워하는 사람의 이름
		/*String[] name = {"may", "kein", "kain", "radi"};
		
		// 그리움 점수
		int[] yearning = {5, 10, 1, 3};
		
		// 각 사진에 찍힌 인물의 이름
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		// result
		int[] answer = new int[photo.length];
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<name.length; i++) {

			 String nameItem = name[i];
			 int point = yearning[i];
			 
			 map.put(nameItem, point);
			
		}// outer for
		
		for(int j=0; j<photo.length; j++) {
			
			for(String item: photo[j]) {
				answer[j] += map.getOrDefault(item, 0);
			}
		}// inner for
		*/
		
		
		// 달리기 경주: https://school.programmers.co.kr/learn/courses/30/lessons/178871
		/*String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] answer = new String[players.length];
		
		// map에 담기
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);
		}

		// callings 반복
		for(String name:callings) {

			// call한 사람의 인덱스 가져오기
			int idx = map.get(name);

			// call한 사람의 앞 사람 가져오기
			String frontPlayer = players[idx-1];
			
			// 앞 사람의 순위 변경
			map.replace(frontPlayer, idx);
			players[idx] = frontPlayer;
			
			// call한 사람의 순위 변경
			map.replace(name, idx-1);
			players[idx-1] = name;
		} */
		
		
		// 2024 KAKAO WINTER INTERNSHIP
		// 가장 많이 받은 선물: https://school.programmers.co.kr/learn/courses/30/lessons/258712
		
		// 친구들의 이름
		/*String[] friends = {"muzi", "ryan", "frodo", "neo"};
		
		// 이번 달까지 친구들이 주고받은 선물 기록
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		// 선물을 가장 많이 받을 친구가 받을 선물의 수
		int answer = 0;
		
		// 각각의 사람의 이름과 변수에서의 index를 저장하기 위한 변수
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<friends.length; i++) {
			map.put(friends[i], i);
		}
		
		// 선물 지수를 저장할 변수
		int[] index = new int[friends.length];
		
		// 주고 받은 선물 내역을 저장할 변수
		int[][] exchange = new int[friends.length][friends.length];
		
		// 주고받은 선물 수를 비교한다.
		for(String names:gifts) {
			
			String[] name = names.split(" ");
			index[map.get(name[0])]++;
			index[map.get(name[1])]--;
			exchange[map.get(name[0])][map.get(name[1])]++;
			
//			System.out.println("++: " + index[map.get(name[0])]++);
//			System.out.println("--: " +index[map.get(name[0])]--);
//			System.out.println("exchange: " + exchange[map.get(name[0])][map.get(name[1])]++);
		}

		for(int i=0; i<friends.length; i++) {
			
			int num = 0;
			
			for(int j=0; j<friends.length; j++) {
			
				// i와 j가 같다 = 자기 자신의 선물지수는 의미없음
				if(i == j) { continue; }
				
				if(exchange[i][j] > exchange[j][i]
					|| exchange[i][j] == exchange[j][i]
					&& index[i] > index[j]) {
					num++;
				}//if
			}// inner for

			if(answer < num) {
				answer = num;
			}
			
		}// outer for
		
		System.out.println(answer);*/
		
		
		
		// [PCCP 기출문제] 1번 / 붕대 감기: https://school.programmers.co.kr/learn/courses/30/lessons/250137
		
		// 붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량
		/*int[] bandage = {5, 1, 5};
		
		// 최대 체력을 의미하는 정수
		int health = 30; 
		
		// 몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열
//		int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
//		int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
		int[][] attacks = {{1, 2}, {3, 2}};
		
		// 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.
		int answer = health;
		
		// 공격
		int idx = 0;
		int success = 0;
		
		// 공격 시 체력 회복
		for(int i=1; i<attacks[attacks.length-1][0]; i++) {

			// 공격 받을 때
			if(i == attacks[idx][0]) {
				
				// 시간차가 맞고 공격을 받으면 체력에서 피해량을 뺀다
				answer -= attacks[idx][1];
				success = 0;
				idx++;
				
				if(answer <= 0) return -1;
				
			}else {
			
				answer += bandage[1];
				success++;
				
				if(success == bandage[0]) {
					answer += bandage[2];
					success = 0;
				}
				
				if(answer > health) {
					answer = health;
				}
				
			}

		}*/


		// [PCCE 기출문제] 9번 / 이웃한 칸: https://school.programmers.co.kr/learn/courses/30/lessons/250125
		
		// 보드의 각 칸에 칠해진 색깔 이름이 담긴 이차원 문자열 리스트
		/*String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}; 
//		String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}; 
		
		// 높이
		int h = 1;
		
		// 넓이
		int w = 1;
		
		// 정수를 저장할 변수
		int n = board.length;
		
		// 같은 색으로 색칠된 칸의 개수
		int count = 0;
		
		// 칸의 개수
		int answer = 0;
		
		// h와 w의 변화량을 저장할 정수 리스트
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        for(int i=0; i<4; i++) {
        	
        	// 체크할 칸의 h, w 좌표를 나타내는 변수 h_check, w_check를 만들고 각각 h + dh[i], w + dw[i]를 저장합니다.
        	int h_check = h + dh[i];
        	int w_check = w + dw[i];
        	
        	// h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만이라면 다음을 수행합니다.
        	if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
        
        		// board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가시킵니다.
        		if(board[h][w].equals(board[h_check][w_check])) {
        			count++;
        		}
        	}
        }
        
        // count의 값을 return합니다.
        System.out.println(count);*/
		
		
		
		// 피보나치 수: https://school.programmers.co.kr/learn/courses/30/lessons/12945?language=java
		/*int n = 5;
		int answer = 0;
		
		// 피보나치 수를 넣을 배열을 만든다
		int arr[] = new int[n+1];
		
		arr[0] = 0;
		arr[1] = 1;
		
		
		for(int i=2; i<=n; i++) {
			arr[i] =  (arr[i-2] + arr[i-1]) % 1234567;
        }
		        
        System.out.println(arr[n]);*/
		
		
		
		// 멀리 뛰기: https://school.programmers.co.kr/learn/courses/30/lessons/12914
		
		// 멀리뛰기에 사용될 칸의 수
		/*int n = 4;
		
		// 끝에 도달하는 방법
		long answer = 0;
		
		long f[] = new long[2000];
        f[0] = 0;
        f[1] = 1L;
        f[2] = 2L;

        for(int i=3; i<=n; i++) {
            f[i] = ( f[i-1] + f[i-2]) % 1234567;
        }*/
		
		
		
		
		
		// 땅따먹기: https://school.programmers.co.kr/learn/courses/30/lessons/12913
		
		// 땅따먹기 게임의 땅
		/*int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		// 마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값
		// 100 이하의 자연수
		int answer = 0;
		
		// 단, 땅따먹기 게임에는 한 행씩 내려올 때, 
		// 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.
		
		// 1행부터 반복한다.
		for(int i=1; i<land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
			land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
		}
		
		answer = Arrays.stream(land[land.length-1]).max().getAsInt();

		System.out.println(answer);*/
		
		
		
		// 숫자의 표현: https://school.programmers.co.kr/learn/courses/30/lessons/12924
		/*int n = 15;
		int answer = 0;
		
		// 1.
		for(int i=1; i<=n; i++) {

			int sum = 0;
			
			for(int j=i; j<=n; j++) {
				sum += j;

				if(sum == n) {
					answer++;
				}else if(sum>n) {
					break;
				}
			}
		}*/
		
		// 2.
		/*for(int i=1; i<=n; i+=2){
            if(n % i == 0) answer++;
            System.out.println("i: " + i);
        }*/
		
//		System.out.println("answer: " + answer);
		
		
		
		
		// 최솟값 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12941
		/*int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		// 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다.
		for(int i=0; i<A.length; i++) {
			answer += A[i] * B[A.length-i-1];
		}
		
		System.out.println(answer);*/
		
		
		
		// 최댓값과 최솟값: https://school.programmers.co.kr/learn/courses/30/lessons/12939
		/*String s = "1 2 3 4";
		String answer = "";
		String[] str = s.split(" ");
		
		int max = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[0]);
		
		for(String a:str) {

			int n = Integer.parseInt(a);
			max = Math.max(max, n);
			min = Math.min(min, n);
		}
		
		answer = String.format("%d %d", min, max);
		
		System.out.println(answer);*/
	
		
		
		
		
		// JadenCase 문자열 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12951
		/*String s = "3people unFollowed me";
		String answer = "";
		String[] strArr = s.toLowerCase().split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			
			String d = strArr[i];
			
			if(strArr[i].length() == 0) answer += " ";
			else {
				answer += d.substring(0, 1).toUpperCase();
				answer += d.substring(1);
				answer += " ";
			}
			
//			answer += strArr[i].replace(strArr[i].charAt(0), Character.toUpperCase(strArr[i].charAt(0)));
//			System.out.println(strArr[i].replace(strArr[i].charAt(0), Character.toUpperCase(strArr[i].charAt(0))));
		}

		// 맨 끝에 공백이 있을 경우
		if(s.substring(s.length()-1).equals(" ")) {
			return answer;
		}
		
		return answer.substring(0, answer.length()-1);*/
		
		
		
		// 행렬의 곱셈: https://school.programmers.co.kr/learn/courses/30/lessons/12949
		/*int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
		int[][] arr2 = {{3, 3}, {3, 3}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2[0].length; j++) {

				for(int l=0; l<arr1[0].length; l++) {
					answer[i][j] += arr1[i][l] * arr2[l][j];
				}
				
				System.out.println(answer[i][j]);
			}
		}*/

		
		// 2020 카카오 인턴십
		// 키패드 누르기: https://school.programmers.co.kr/learn/courses/30/lessons/67256
		
		// d1 = (n-l) / 3 + (n-l) % 3
		
		/*int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
//		String hand = "left";
		String answer = "";
		int left = 10;
		int right = 12;
		
		// L 1,4,7,*(10) / R 3,6,9,#(12) / C 2,5,8,0(11)
		
		for(int i=0; i<numbers.length; i++) {

			if(numbers[i] == 0) numbers[i] = 11;
			
			if(numbers[i] == 1 || numbers[i] == 4 
					|| numbers[i] == 7 || numbers[i] == 10) {
				
				answer += "L";
				left = numbers[i];
				
			}else if(numbers[i] == 3 || numbers[i] == 6 
					|| numbers[i] == 9 || numbers[i] == 12){
				
				answer += "R";
				right  = numbers[i];
				
			}else {
				String pos = isHand(numbers[i], left, right, hand);
				
				if(pos.equals("L")) {
					answer += "L"; left = numbers[i];
				}
				if(pos.equals("R")) {
					answer += "R"; right  = numbers[i];
				}
				
			}// outer if
		}// for
		System.out.println("answer: "+answer);*/
//    }
	
	
	/*public static String isHand(int num, int left, int right, String hand) throws Exception {
		
		String handPosition = "";
		int leftDistance = 0;
		int rightDistance = 0;
		
		//경로 절대값 구하기
        leftDistance = Math.abs(num-left);
        rightDistance = Math.abs(num-right);
		
        leftDistance = (leftDistance / 3) + (leftDistance % 3);
        rightDistance = (rightDistance / 3) + (rightDistance % 3);
        
        if(leftDistance < rightDistance) {
			handPosition = "L";
		
        }else if(leftDistance > rightDistance) {
			handPosition = "R";
		}else {
			if(hand.equals("left")) handPosition = "L";
			if(hand.equals("right")) handPosition = "R";
		}
		
		return handPosition;
	}*/
	
	
	// N개의 최소공배수: https://school.programmers.co.kr/learn/courses/30/lessons/12953
		int[] arr = {2,6,8,14};
		int answer = arr[0];

        for(int i=1; i<arr.length; i++){
        	answer = lcm(arr[i], answer);
        }
	
		System.out.println(answer);
		
	}
	
	// 최소공배수
	static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}

	// 최대공약수
	static int gcd(int a, int b){
        
		if(b==0) return a;
		
//        int r = a % b;
//        if(r == 0) return b;
        return gcd(b, a%b);
    }

}