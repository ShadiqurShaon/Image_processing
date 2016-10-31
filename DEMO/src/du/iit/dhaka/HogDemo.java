package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HogDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedImage image;
		int width;
		int height;
		double  Gx[][], Gy[][], G[][]; 

		File file=new File("D:/number/483493.jpg");
		image = ImageIO.read(file);
		width = image.getWidth();
		height = image.getHeight();


		int[][] imgArray=new int[height][width];
		Gx = new double[height][width];   
		Gy = new double[height][width]; 
		G  = new double[height][width];
		int[] pixels = new int[width * height];

		for(int i=0; i<height; i++){

			for(int j=0; j<width; j++){

				Color c = new Color(image.getRGB(j,i));
				int red = (int)(c.getRed() * 0.299);
				int green = (int)(c.getGreen() * 0.587);
				int blue = (int)(c.getBlue() *0.114);
				Color newColor = new Color(red+green+blue,

						red+green+blue,red+green+blue);
				int grayvalue=(newColor.getRed()+newColor.getGreen()+newColor.getBlue())/3;
				imgArray[i][j]=grayvalue;
			}

		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i==0 || i==height-1 || j==0 || j==width-1) {Gx[i][j] = Gy[i][j] = G[i][j] = 0;}
				else{
					
					Gx[i][j]=imgArray[i][j+1]-imgArray[i][j-1];
					Gy[i][j]=imgArray[i+1][j]-imgArray[i-1][j];
					
					double angle=Math.abs( Math.atan2(Gy[i][j], Gx[i][j]));
					System.out.println(Math.toDegrees(angle));
					
					
				}
				
			}
		}
	}

}
