package _01_getters_and_setters;

public class Car {
	private int numberOfDoors;
	private String type;
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setNumberOfDoos(int n) {
		numberOfDoors = n;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getType() {
		return type;
	}
}
