package codingtest.ct.week01;

public class Radio implements RemoteControl{

	// 인터페이스에 있는 메소드를 사용해야한다.
	
	int volume = 0;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
	}

}
