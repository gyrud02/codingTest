package codingtest.ct.week05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class codingTestPrac {

	public static void main(String[] args) {
		
		// 폰켓몬: https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
		
		/*int[] nums = {3,3,3,2,2,4};
		
		int answer = 0;
		int temp = 0;
        
        // 해시를 사용하여 문제 풀이
        // 중복된 번호는 한 마리만 가질 수 있다.
        
        Map<Integer, Object> map = new HashMap<>();
        
        for(int i=0; i<nums.length+1; i++){
            
            temp = nums[i+1];
            if(temp == nums[i+1]) map.put(i, nums[i]);
            
            System.out.println(nums[i]);
            System.out.println(map.get(i));
        }*/
		
		
		// 2016년: https://school.programmers.co.kr/learn/courses/30/lessons/12901

		/*String answer = "";
        int temp = 0;
        
        int a = 5;
        int b = 24;
        
        // 요일 구하기 공식 0~6
        // 윤년 29일
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        // 1~31
        int[] month = {31,29,31,30,31,30,31,31,30,30,30,31};
        
        for(int i=0; i<a-1; i++){
            temp += month[i];
            System.out.println("temp: " + temp);
        }
        
        temp += b-1;
        
        answer = week[temp % 7];*/
        
		
		// 같은 숫자는 싫어: https://school.programmers.co.kr/learn/courses/30/lessons/12906
		
		/* stack */
		//int []arr = {1,1,3,3,0,1,1};
	
		/*Stack<Integer> stack = new Stack<>();
		
		for(int i:arr) {
            if(stack.isEmpty()) stack.push(i);
            else if(stack.peek() != i) stack.push(i);
		}
		
		int[] answer = new int[stack.size()];
		
		for(int i=answer.length-1; i>=0; i--) {
			answer[i] = stack.pop();
		}*/
		
		
		/* Queue */
		/*Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(arr[0]);
		
		int last = arr[0];
		
		// 위 0번 인덱스에 값을 넣었기 때문에
		for(int i=1; i<arr.length; i++) {

			if(last != arr[i]) {
				queue.offer(arr[i]);
				last = arr[i];
			}
		}

		int[] answer = new int[queue.size()];
		int cnt = 0;
		
		while(!queue.isEmpty()) {
			answer[cnt++] = queue.poll();
		}*/
		
	
		
		// 두 정수 사이의 합: https://school.programmers.co.kr/learn/courses/30/lessons/12912
		
		/*long answer = 0;
		int a = 3;
		int b = 5;
		
        int[] arr = new int[2];
        
        arr[0] = a;
        arr[1] = b;
        
        Arrays.sort(arr);
        

        for(int i=0; i<a-b*-1; i++){
            answer += i;
            System.out.println(answer);
        }*/
	}
}