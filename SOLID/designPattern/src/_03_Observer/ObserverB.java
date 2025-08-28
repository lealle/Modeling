package _03_Observer;

public class ObserverB implements Observer {

	public void update() {
		System.out.println("ObserverB님 이벤트 알림이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObseverB";
	}

}
