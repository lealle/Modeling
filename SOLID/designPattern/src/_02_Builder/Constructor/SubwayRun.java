package _02_Builder.Constructor;

public class SubwayRun {
	public static void main(String[] args) {
		Subway menu1 = new Subway(15, "오트밀", "칠리");
		System.out.println(menu1);
		
		
		Subway menu2 = new Subway(30, "오트밀", "모짜렐라","베이컨",true,"핫칠리"); // 순서도 지켜줘야하는데 사용자는 그런거에 대해서 알 수 없으
		System.out.println(menu2); // 인자의 순서도 헷갈림 
		// 이렇게 많을때는 차라리 setter 메소드를 쓰는것이 좋다. 
	}
}
