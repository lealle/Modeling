package _06_notDip;

class Dog {
	@Override
	public String toString() {
		return "강아지";
	}
}

class Cat {
	@Override
	public String toString() {
		return "고양이";
	}
}

class Hamster{
	@Override
	public String toString() {
		return "햄스터";
	}
}

class Pet {
	Dog dog;
	Cat cat;
	// 이 클래스가 수정 되어야 함 
	Hamster ham;
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public void setHamster(Hamster ham) {
		this.ham = ham;
	}
	
}
