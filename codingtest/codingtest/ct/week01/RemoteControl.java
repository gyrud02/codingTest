package codingtest.ct.week01;

public interface RemoteControl {

	// 인터페이스
	// - 인터페이스에서는 구현하지 않는다.

	// 1. 상수 선연
	//public		// 모든 패키지에서 사용 가능
	//private		// 같은 클래스에서만 사용 가능
	//protected	// 같은 패키지 / 같은 파일 / 상속된 클래스에서만 사용 가능
	//default		// 같은 패키지에서만 사용 가능
	
	public static final int MAX_VOLUME = 10;// 상수
	int MAX_VOLUM = 0;						// 상수가 아님
	int VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
