package proekt14;

public class Vehicle {
	private String color;
	Vehicle(String a) {
		color = a;
	}
	@Override
	public String toString() {
		return "Vehicle (color" + color + ")";
	}
}
