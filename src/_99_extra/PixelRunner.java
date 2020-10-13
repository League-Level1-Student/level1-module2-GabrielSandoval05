package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
	
		//Random randy = new Random(200-200);
		PixelParty pixel = new PixelParty();
		
		pixel.setRainbow(true);
		for(int i = 0; i<3; i++) {
		pixel.drawCircle(90, 90, 90);
		}
		
		
		for(int g = 0; g<5; g++) {
			pixel.drawRectangle(50, 70, 60, 60);
		}
		
		for(int h = 4; h<8; h++) {
			pixel.drawTriangle(30, 30, 40, 40, 50, 50);
		}
		
		pixel.saveImage();
		pixel.displayImage();
		
	}
	
	
}
