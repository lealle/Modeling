package _02_Builder.builderConstructor;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(25,"통밀","칠리")	
				.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(45,"통밀","핫소스")	
				.setCheeze("모짜")
				.setExtraTopping("베이컨")
				.setVegetable(true)
				.build();
		System.out.println(menu2);		
		// 체인닝 기법 
		
		Scanner sc = new Scanner(System.in);
		
		SubwayBuilder sub = new SubwayBuilder(15,"하티","올리브오일")
				.setCheeze("모짜렐라");
				
		System.out.print("추가토핑을 선택하세요 : ");
		String topping = sc.nextLine();
		Subway menu3 = sub
				.setExtraTopping(topping)
				.build();
		
		System.out.println(menu3);
	}

}
