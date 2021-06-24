package jp.co.aforce.text;

public class Truck extends Car {
	private int payload = 0;
	
	int getPayload() {
		return this.payload;
	}
	void addPayload(int value) {
		this.payload += value;
	}
	void deleatPayload(int value) {
		this.payload -= value;
	}

}
