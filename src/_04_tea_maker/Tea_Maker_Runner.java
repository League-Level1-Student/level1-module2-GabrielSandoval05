package _04_tea_maker;

public class Tea_Maker_Runner {

	public static void main(String[] args) {
		
		TeaBag teabag = new TeaBag ("PassionFruit");
		String flavor = teabag.getFlavor();
		
		Kettle kettle = new Kettle (); 
		kettle.boil();
		
		
		
		Cup cup = new Cup(); 
		cup.makeTea(teabag, kettle.getWater());
		
		
		
		
	}
}
