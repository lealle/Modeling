package _03_Observer;

public class ObserverRun {

	public static void main(String[] args) {
		// 발행자 등록 (누구에게 알려줄 것인지)
		Subject cs = new ConcreteSubject(); 
		
		// 발행자를 구독할 관찰자를 리스트에 등록 
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		cs.registerObserver(oa);
		cs.registerObserver(ob);
		
		// 이벤트 발생 
		cs.notifyObserver();
		
		// 구독 취소
		cs.removeObserver(oa);
		
		cs.notifyObserver();
		
	}

}
