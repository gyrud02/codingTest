package codingtest.ct.week02;

public class codingTestPrac {

	public static void main(String[] args) {
		
		// 소인수분해
		/*List<Integer> list = new ArrayList<>();
		
		int n = 420;
		
        // 소인수분해는 무조건 2부터 
        for(int i=2; i<=n; i++){
            
        	System.out.println("> outer for i : " + i);

        	// Ex) 420 % 2 = 0
            if(n % i == 0){
            	System.out.println("> inner if n  : " + n);
                while(n % i == 0){
                    n /= i;
                    System.out.println("> while n  : " + n);
                }
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }*/
	
		
		// 컨트롤 제트
		/*int answer = 0;
		String s = "10 Z 20 Z 1";
        String convert = "";
        s = s.replaceAll("Z", "");
        s = s.replaceAll(" ", "");
        
        System.out.println(s);
        
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
		
        System.out.println(answer);*/
		
		
		// 캐릭터의 좌표
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		int[] answer = new int[2];
        
        int x = 0, y = 0;
        int left = -(board[0] / 2); 
        int right = (board[0] / 2);
        int up = (board[1] / 2);
        int down = -(board[1] / 2);
            
        // left: -1,0
        // right: 1,0
        // up: 	  0,1
        // down:  0,-1
        
        for(int i=0; i<keyinput.length; i++){
            
        	switch(keyinput[i]){
	            case "left":
	                x--;
	                if(x < left) x = left;                
	                break;
	            case "right":
	                x++;
	                if(x > right) x = right;
	                break;
	            case "up":
	                y++;
	                if(y > up) y = up;
	                break;
	            case "down":
	                y--;
	                if(y < down) y = down;
	                break;
        	}

        }
        
    	answer[0] += x;
    	answer[1] += y;
        
	}
}