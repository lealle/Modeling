package _02_Builder.Constructor;

public class Subway {
	private int size;
	private String bread;
	private String cheeze;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	
	public Subway(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}
	public Subway(int size, String bread, String cheeze, String source) {
		this.size = size;
		this.bread = bread;
		this.cheeze = cheeze;
		this.source = source;
	}
	
	public Subway(int size, String bread, String cheeze, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheeze = cheeze;
		this.vegetable = vegetable;
		this.source = source;
	}
	
	public Subway(int size, String bread, String cheeze, String extraTopping, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheeze = cheeze;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
		this.source = source;
	}
	public Subway(int size, String bread, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.vegetable = vegetable;
		this.source = source;
	}
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheeze=" + cheeze + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
	
	
}
