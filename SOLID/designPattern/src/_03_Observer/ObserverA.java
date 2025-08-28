package _03_Observer;

public class ObserverA implements Observer {

	public void update() {
		System.out.println("ObserverA님 이벤트 알림이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObseverA";
	}

}
