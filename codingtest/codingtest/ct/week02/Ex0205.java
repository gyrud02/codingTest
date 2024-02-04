package codingtest.ct.week02;

import java.util.List;
import java.util.Vector;

public class Ex0205 {

	public static void main(String[] args) {

		// 2. 벡터(Vector)
		// - ArrayList와 동일한 내부 구조를 가지고 있다.
		// - ArrayList와 다른 점은 Vector는 동기화 메소드로 구성되어 있기 때문에 
		//   멀티스레드가 동시에 이 메소드를 실행할 수 없고
		//   하나의 스레드가 실행을 완료해야만 다른 스레드를 실행한다.
	
		Board board = new Board();
		board.setTtl("제목1");
		board.setCn("내용1");
		board.setWriter("작성자1");
		
		List<Board> list = new Vector<Board>();
		list.add(board);
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4"));
		System.out.println(list.toString());
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getWriter() + ", " + b.getCn() + ", " + b.getWriter());
		}
	}
}

class Board{
	
	private String ttl;		// 제목
	private String cn;		// 내용
	private String writer;	// 작성자
	
	// 생성자: 1개 이상 여러개를 만들 수 있다.
	public Board() {}
	public Board(String ttl, String cn, String writer) {
		this.ttl = ttl;
		this.cn = cn;
		this.writer = writer;
	}
	public Board(String ttl, String cn) {
		this.ttl = ttl;
		this.cn = cn;
		this.writer = "관리자";
	}

	////////////////////////////////////////////////////////////////
	
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	/*@Override
	public String toString() {
		return "Board [ttl=" + ttl + ", cn=" + cn + ", writer=" + writer + "]";
	}*/
	
	
}
