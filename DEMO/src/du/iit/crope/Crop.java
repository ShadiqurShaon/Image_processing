package du.iit.crope;

public class Crop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		javaxt.io.Image image = new javaxt.io.Image("C:/Users/Shaon/Desktop/New folder (2)/HS/34233661FCF.jpg");
	
		image.crop(500,500,500,500);
		image.saveAs("C:/Users/Shaon/Desktop/New folder (2)/34233661FCF.png");

	}

}
