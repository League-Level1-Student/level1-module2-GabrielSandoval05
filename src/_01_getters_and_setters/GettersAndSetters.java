package _01_getters_and_setters;

public class GettersAndSetters {
	public static void main(String[] args) {
		Car ford = new Car();
		Car honda = new Car();
		
		ford.setNumberOfDoos(4);
		honda.setNumberOfDoos(2);
		
		System.out.println(ford.getNumberOfDoors());
		System.out.println(honda.getNumberOfDoors());
	}
}
