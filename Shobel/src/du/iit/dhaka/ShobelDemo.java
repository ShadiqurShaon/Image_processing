package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class ShobelDemo {

	
	public static void main(String[] args) throws IOException {
		//ArrayList<Integer> imgArray = new ArrayList<Integer>();
		 double  Gx[][], Gy[][], G[][]; 
		 
		BufferedImage image;
		   int width;
		   int height;
		   
		   File file=new File("D:/number/s.png");
		   image = ImageIO.read(file);
		  
		   
		   width = image.getWidth();
	       height = image.getHeight();
//	       System.out.println(width);
//	       System.out.println(height);
	       int[][] imgArray=new int[height][width];
	       Gx = new double[height][width];   
	       Gy = new double[height][width];   
	       G  = new double[height][width];
	       int[] pixels = new int[width * height]; 
	       
	       for(int i=0; i<height; i++){
	             
	             for(int j=0; j<width; j++){
	            	 
	            	 Color c = new Color(image.getRGB(i,j));
	            	 int red = (int)(c.getRed() * 0.299);
	                 int green = (int)(c.getGreen() * 0.587);
	                 int blue = (int)(c.getBlue() *0.114);
	                 Color newColor = new Color(red+green+blue,
	                         
	                         red+green+blue,red+green+blue);
	                 int grayvalue=newColor.getRGB();
	            	 imgArray[i][j]=grayvalue;
	             }
	             
	       }
		 
	       for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i==0 || i==height-1 || j==0 || j==width-1) {Gx[i][j] = Gy[i][j] = G[i][j] = 0;} // Image boundary cleared   
		        else{   
		            Gx[i][j] = imgArray[i+1][j-1] + 2*imgArray[i+1][j] + imgArray[i+1][j+1] -   
		            		imgArray[i-1][j-1] - 2*imgArray[i-1][j] - imgArray[i-1][j+1];   
		            Gy[i][j] = imgArray[i-1][j+1] + 2*imgArray[i][j+1] + imgArray[i+1][j+1] -   
		            		imgArray[i-1][j-1] - 2*imgArray[i][j-1] - imgArray[i+1][j-1];  
		            
//		            double x=Gx[i][j]*Gx[i][j]; double y=Gy[i][j]*Gy[i][j];
//		            int temp=(int) (x+y);
//		            G[i][j]=Math.sqrt(temp);
		            G[i][j]  =  Math.abs(Gy[i][j])+Math.abs(Gx[i][j]);   
		          }     
				
				
			}
			}
//	       	int count=0;
//	       for (int i = 0; i <height; i++) {
//			for (int j = 0; j < width; j++) {
//				pixels[count]=(int) imgArray[i][j];
//				count=count+1;
//			}
//		}
//	       
	       
	       
	       
	       
//	       BufferedImage outImg = new BufferedImage(height,width,BufferedImage.TYPE_BYTE_GRAY);   
//	       outImg.getRaster().setPixels(0,0,height,width,pixels);   
//	       FileOutputStream outFile = new FileOutputStream("D:/number/saved.jpg");   
//	       ImageIO.write(outImg,"jpg",outFile);
	       
	       
	       
	       BufferedImage bufferImage2=new BufferedImage(height, width,BufferedImage.TYPE_INT_RGB);
	       
	      // bufferImage2.getRaster().setPixels(0, 0, height, width, pixels);
	       int c=0;
	       for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int Pixel=(int) G[i][j];
				bufferImage2.setRGB(i,j,Pixel);
				c++;
			}
			System.out.println(c);
		}
	       System.out.println(imgArray.length);
	      // System.out.println(c);
	       File outputfile = new File("D:/number/saved2.jpg");
	         ImageIO.write(bufferImage2, "jpg", outputfile);
		   
		   
	}

}
