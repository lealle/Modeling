package _02_Builder.builder;

public class SubwayBuilder {
	private int size;
	private String bread;
	private String cheeze;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	// 1. 멤버에 대한 setter 메소드 구현  
	/*
		메서드 지정하는 방법
		- 일반 속석명과 동일하게 사용 가능 
		- with 키워드 : 일반 setter 메소드와 차별화를 위해 with 라는 키워드 사용 
		- 반환형은 클래스를 반환 
	*/

//	public SubwayBuilder withSize(int size) { with 써도 됨 근데 set 많이씀 
//		this.size = size;
//		return this;
//	}
	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public SubwayBuilder setBread(String bread) { // with 라고 넣어도 
		this.bread = bread;
		return this;
	}

	public SubwayBuilder setCheeze(String cheeze) {
		this.cheeze = cheeze;
		return this;
	}

	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;

	}

	public SubwayBuilder setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
		return this;
	}

	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;
	}
	
	// 2. Subway 의 생성자를 호출
	public Subway build() {
		return new Subway(size, bread, cheeze, extraTopping, vegetable, source);
	}

	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheeze=" + cheeze + ", extraTopping="
				+ extraTopping + ", vegetable=" + vegetable + ", source=" + source + "]";
	} // 없어도 되는데 그냥 출력하려고 넣은것



}
