package _03_lsp;

class Cat{
	void speak() {
		System.out.println("야옹");
	}
}

class BlackCat extends Cat{
	String color = "black";
	@Override
	void speak() {
		System.out.println("냐옹");
	}
}

class WhiteCat extends Cat{
	String color = "white";
	@Override
	void speak() {
		System.out.println("크아아~~");
	}
}



public class LspRun {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new WhiteCat();
		Cat c3 = new BlackCat();		
		
		c1.speak();
		c2.speak();
		c3.speak();
		// Override 시 무조건 자식것
		
		c1.speak();
		
		WhiteCat wc = new WhiteCat();
		wc.speak();
		// 이런식으로 speak 를 자식들이 다 정의할경우 부모클래스는 굳이 만들필요 없음 abstract 하든가 자식의 speak를 쓰지말던가 하기
		
	}

}
