package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SplitLine {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedImage image;
		   int width;
		   int height;
		   
		   File file=new File("D:/number/protom.jpg");
		   image = ImageIO.read(file);
	         width = image.getWidth();
	         height = image.getHeight();
		   
	         int[][] imgmat=new int[width][height];
	         int[][] imgmat2=new int[width][height];
	         
	         for(int i=0; i<height; i++){
	             
	        	 int count=0;
	             for(int j=0; j<width; j++){
	             
	            	 
	            	 
	            	 
	                Color c = new Color(image.getRGB(j, i));
	                //System.out.println("S.No: " +count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
	                
	                int imageVlaue=(c.getBlue()+c.getGreen()+c.getRed())/3;
	                
	                
	                
	                
	                
	                
	                //System.out.println(imageVlaue);
	                if(imageVlaue==255){
	                	imgmat2[j][i]=255;
	                }else{
	                	imgmat2[j][i]=0;
	                }
	                
	                System.out.println(count);
	                imgmat[j][i]=c.getRGB();
	                
	                
	                
	             }
	          }
	         
	         
	         for (int i = 0; i < imgmat2.length; i++) {
				for (int j = 0; j < imgmat2.length; j++) {
					
				}
			}
	         
	         
	         
	         
BufferedImage outputImg=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	         
	         for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					int Pixel=imgmat[j][i];
					outputImg.setRGB(j,i,Pixel);
				}
			}
	         File outputfile = new File("D:/number/pr.jpg");
	         ImageIO.write(outputImg, "jpg", outputfile);

	}

}
