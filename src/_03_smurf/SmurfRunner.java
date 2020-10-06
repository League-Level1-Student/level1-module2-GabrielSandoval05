package _03_smurf;

public class SmurfRunner {
	
	public static void main(String[] args) {
		
		Smurf handy = new Smurf("Handy");
		handy.eat();
		String name = handy.getName();
		System.out.println(name);
		
		Smurf papa = new Smurf("Papa");
		String nickname = papa.getName();
		System.out.println(nickname);
		
		String hatColor = papa.getHatColor();
		System.out.println(hatColor);
		
		String gender = papa.isGirlOrBoy();
		System.out.println(gender);
		
		
		Smurf smurfette = new Smurf("Smurfette");
		String calling = smurfette.getName();
		System.out.println(calling);
		
		String colorOfHat = smurfette.getHatColor();
		System.out.println(colorOfHat);
		
		String orientation = smurfette.isGirlOrBoy();
		System.out.println(orientation);
		
		
	}

}
