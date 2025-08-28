package _03_Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	// 관찰자들을 등록하는 리스트
	List<Observer> observer = new ArrayList<>(); 
	
	// 관찰자를 리스트에 등록
	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
		System.out.println(o+"구독 완료");
	}

	// 관찰자를 리스트에서 제거 
	@Override
	public void removeObserver(Observer o) {
		observer.remove(o);
		System.out.println(o+"구독 취소");
	}

	// 관찰자에서 이벤트 송신
	@Override
	public void notifyObserver() {
		for(Observer o : observer) {
			o.update();
		}
	}

}
