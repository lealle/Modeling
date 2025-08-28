package _05_isp;

class Sedan implements Car{

	@Override
	public void drive() {
		System.out.println("운행중");
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnLight() {
		System.out.println("우회전");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}
	
}


class FireEngine implements FireCar, Car{

	@Override
	public void drive() {
		System.out.println("운행중");		
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnLight() {
		System.out.println("우회전");		
	}

	@Override
	public void stop() {
		System.out.println("정지");		
	}
	@Override
	public void water() {
		System.out.println("물을 뿌립니다");		
	}
	
}

class Ambulance implements AmbulanceCar{ // AmbulanceCar에 Car 상속받아 Car 도 상속받을 필요 x  

	@Override
	public void drive() {
		System.out.println("운행중");		
	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
	}

	@Override
	public void turnLight() {
		System.out.println("우회전");		
	}

	@Override
	public void stop() {
		System.out.println("정지");		
	}
	@Override
	public void patientTransport() {
		System.out.println("환자 이송중");
	}
	
}



public class CarRun {
	public static void main(String[] args) {
		Car car = new Sedan();
	
		
		
	}
}
