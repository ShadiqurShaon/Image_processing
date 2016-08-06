package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import javax.imageio.ImageIO;

public class Binary {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedImage image;
		   int width;
		   int height;
		   
		   File file=new File("D:/number/protom.png");
		   image = ImageIO.read(file);
	         width = image.getWidth();
	         height = image.getHeight();
		   
	         int[][] imgmat=new int[width][height];
	         for(int i=0; i<height; i++){
	             
	             for(int j=0; j<width; j++){
	             
	                Color c = new Color(image.getRGB(j, i));
	                //System.out.println("S.No: " +count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
	                
	                int imageVlaue=(c.getBlue()+c.getGreen()+c.getRed())/3;
	                if(imageVlaue<=150){
	                	imgmat[j][i]=new Color(255,255,255).getRGB();
	                }else{
	                	imgmat[j][i]=new Color(0,0,0).getRGB();
	                }
	                
	                //arr.add(imageVlaue);
	                
	             }
	          }
	         BufferedImage outputImg=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	         
	         for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					int Pixel=imgmat[j][i];
					outputImg.setRGB(j,i,Pixel);
				}
			}
	         File outputfile = new File("D:/number/protom.jpg");
	         ImageIO.write(outputImg, "jpg", outputfile);
	}

}