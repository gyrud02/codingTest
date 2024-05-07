package codingtest.ct.week04;

import java.util.Arrays;

public class codingTestPrac {

	public static void main(String[] args) {
		
//		String[] spell = {"p", "o", "s"};
//		String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
//		int cnt = 0;
		
		// spell 반복
		/*for(int i=0; i<spell.length; i++) {
			
			// dic 반복
			for(int j=0; j<dic[i].length(); j++) {
				
				System.out.println("dic["+i+"].length() : " + dic[i].length());
				
				if(dic[i].contains(spell[i])) {
				}
			}
			//cnt++;
		}
		
		System.out.println("cnt : "+cnt);*/
		
		// dic 반복
		/*for(int i=0; i<dic.length; i++) {
			
			String words = dic[i];
			int spellCnt = spell.length;
			
			// spell 반복
			for(int j=0; j<spell.length; j++) {
				if(words.contains(spell)) {
				}
			}
			//cnt++;
		}*/
		
		
		
		////////////////////////////////////////////////////////////////
		
		/* 저주의 숫자 */
		
		/*int n = 15;
		int answer = 0;
		
		// 3의 배수가 몇번인지
        int cnt = 0;
        
        // n과 cnt를 합친 숫자
        int sum = 0;
        String str = "";
        
        // 3으로 끝나는 숫자가 몇번인지
        int num = 0;
        
        // N만큼 돌리면서 3의 배수를 찾는다.
        for(int i=1; i<n; i++){
        	
        	// 3의 배수를 찾는다.
            if(n % 3 != 0){
            	
            	sum = n + cnt;
            	str = String.valueOf(sum);
            	
            	// 3으로 끝나는 숫자를 확인한다.
            	if(str.contains("3")) {
            		num++;
            	}
          
                cnt++;
            }          
        }
        
        answer = n + cnt + num;*/
		
		////////////////////////////////////////////////////////////////
		
		/* 로그인 성공? */
		/*String answer = "";
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		
		for(int i=0; i<db.length; i++){
	         
            // 아이디 비교
            if(db[i][0].equals(id_pw[0])){
                
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                    break;
                }else{
                    //return "wrong pw";
                }
                
            }else{  
                answer = "fail";
            }   
        }*/
        //return answer;

		////////////////////////////////////////////////////////////////
				
		/* 치킨 쿠폰 */
		/*int chicken = 1081;
		int answer = 0;			// 먹을 수 있는 개수
		int coupon = chicken;
        
        while(coupon >= 10){

        	answer += coupon / 10; 
        	coupon = coupon / 10 + coupon % 10;
        	
        	System.out.println("coupon : "+coupon);
        	System.out.println("answer : "+answer);
        }*/

        
        ////////////////////////////////////////////////////////////////
        
        /* 이진수 더하기 */
		
		/*String bin1 = "1001"; 
		String bin2 = "1111";
		String answer = "";
		
        int a = 0;
        int b = 0;
        int sum = 0;
        
        a = Integer.parseInt(bin1, 10);
//        String binary1 = Integer.toOctalString(a);

        b = Integer.parseInt(bin2, 10);
//        String binary2 = Integer.toOctalString(b);

        sum = a + b;
        
        System.out.println("sum : " + sum);
//        System.out.println("binary1 : " + binary1);
//        System.out.println("binary2 : " + binary2);
        
//        answer = binary1+ binary2;
        
        System.out.println("answer : " + answer);*/
		
		
		////////////////////////////////////////////////////////////////
		
		/* A로 B 만들기 */
		
		/*String before = "olleh";
		String after = "hello";
		
		String[] arr1= new String[before.length()];
		String[] arr2 = new String[after.length()];

        // reverse
        StringBuffer sb = new StringBuffer(before);
        String beforeReverse = sb.reverse().toString();
		
        for(int i=0; i<before.length(); i++){
        	arr1[i] = String.valueOf(before.charAt(i));
        	arr2[i] = String.valueOf(beforeReverse.charAt(i));
        	
        	System.out.println(arr1[i].equals(arr2[i]));
    		
        	for(int j=0; j<arr2.length; j++) {
        		if(arr1[i].equals(arr2[i])) {
        			cnt++;
        			
        			if(cnt == 5) {
        				answer = 1;
        			}else {
        				answer = 0;
        			}
        		}
        	}
        	
    		System.out.println(cnt);
        	
        }
        

        // for문과 동일하다.
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        for(int i=0; i<a.length; i++) {
//        	System.out.println("1: "+a[i]);
//        	System.out.println("1: "+b[i]);
        }
        
        // 오름차순으로 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++) {
//        	System.out.println("2: "+a[i]);
        	System.out.println("2: "+b[i]);
        }
        
        String str1 = new String(a);
        System.out.println("3: "+str1);
        
        String str2 = new String(b);

        System.out.println(str1.equals(str2) ? 1:0);*/
		
		
		////////////////////////////////////////////////////////////////
				
		/* 문자와 소문자 */
		
		/*String my_string = "cccCCC";
		String answer = "";
		 
		for(int i=0; i<my_string.length(); i++) {
			
			if(Character.isUpperCase(my_string.charAt(i))) {
				answer += my_string.substring(i, i+1).toLowerCase();
			}else {
				answer += my_string.substring(i, i+1).toUpperCase();
			}
		}*/

		
		////////////////////////////////////////////////////////////////
		
		/* OX퀴즈 */
		
		/*String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){

            String[] str = quiz[i].split(" ");

            int tmp1 = Integer.parseInt(str[0]);
            int tmp2 = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);
            
            if(str[1].equals("+")) {
            	answer[i] = (tmp1 + tmp2 == result) ? "O":"X";
            }else {
            	answer[i] = (tmp1 - tmp2 == result) ? "O":"X";
            }
        }*/

		
		////////////////////////////////////////////////////////////////
		
		/* 다음에 올 숫자 */
		
		int[] common = {2, 4, 8};
		int answer = 0;
		
		// 등차수열 [1,2,3,4]
        // 등비수열 [2,4,8]
        
        for(int i=0; i<common.length-1; i++){
            
            // 등차수열
            if(common[i] % 2 != 0){
//            	if(common[i+1] - common[i] <= 2){
                answer = common[i] + 2;
            
            // 등비수열
            }else{
                answer = common[i] * (common[i+1] - common[i]);
            }
            
           System.out.println(answer);
        }
		
	}
}