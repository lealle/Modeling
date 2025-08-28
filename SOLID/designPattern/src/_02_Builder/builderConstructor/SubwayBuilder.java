package _02_Builder.builderConstructor;

public class SubwayBuilder {
	private int size;
	private String bread;
	private String cheeze;
	private String extraTopping;
	private boolean vegetable;
	private String source;

	// 필수 멤버 빌더의 생성자를 통해 설정 
	public SubwayBuilder(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}

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
