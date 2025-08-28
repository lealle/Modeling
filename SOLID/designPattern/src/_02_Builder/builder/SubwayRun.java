package _02_Builder.builder;

public class SubwayRun {

	public static void main(String[] args) {
		// Method Chaining 방식 : 자기 자신을 반환하면서 다른 함수를 지속적으로 호출하는 릴레이 방식의 프로그래밍 패턴 
		Subway menu1 = new SubwayBuilder()
					.setBread("통밀")
					.setCheeze("모짜렐라")
					.setSize(15)
					.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
					.setBread("통밀")
					.setCheeze("모짜")
					.setSize(15)
					.setExtraTopping("베이컨")
					.setVegetable(true)
					.setSource("청양마요")
					.build();
		System.out.println(menu2);		
		// 체인닝 기법 
		
	}

}
