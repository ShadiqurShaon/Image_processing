package du.iit.dhaka;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sh {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream inFile = new FileInputStream("D:/number/shobel.bmp");
		  BufferedImage inImg = ImageIO.read(inFile);
		  int width = inImg.getWidth();   
	      int height = inImg.getHeight();
	      int[] pixels = new int[width * height]; 
	      inImg.getRaster().getPixels(0,0,width,height,pixels);   

	}

}
