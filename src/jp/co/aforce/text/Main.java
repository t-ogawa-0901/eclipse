package jp.co.aforce.text;

public class Main {
	public static void main(String[] args) {
		Car car;
		car = new Car();
		
//		car.speed = 80;
//		System.out.println("スピード："+ car.speed);
//		
//		car.speedUp(10);
//		System.out.println("スピード："+ car.speed);
//		
//		int newSpeed = 80;
//		car.speedUp(newSpeed);
//		System.out.println("スピード："+ car.speed);
		
		car.speedUp(40);
		car.speedDown(10);
		System.out.println("スピード："+ car.getSpeed());
		
		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);
		
		LongDriverTruck longDriverTruck = new LongDriverTruck();
		longDriverTruck.sleepInBed();
		longDriverTruck.addPayload(10);
		longDriverTruck.speedUp(60);
	}

}
