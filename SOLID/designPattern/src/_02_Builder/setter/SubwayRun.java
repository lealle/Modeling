package _02_Builder.setter;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway();
		menu1.setSize(15);
		menu1.setBread("허니오트");
		menu1.setCheeze("모짜렐라");
		menu1.setExtraTopping("아보카도");
		menu1.setSource("핫칠리");
		menu1.setVegetable(true);
		System.out.println(menu1);
		
		Subway menu2 = new Subway();
		menu2.setSize(30);
		menu2.setBread("허니오트");
		menu2.setCheeze("모짜렐라");
		menu2.setExtraTopping("베이컨");
		menu2.setSource("핫칠리");
		menu2.setVegetable(false);
		System.out.println(menu2);
		
		
		
	
	}

}
