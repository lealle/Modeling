package _02_Builder.setter;

public class Subway {
	private int size;
	private String bread;
	private String cheeze;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public void setSize(int size) {
		this.size = size;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCheeze(String cheeze) {
		this.cheeze = cheeze;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheeze=" + cheeze + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
	
}
