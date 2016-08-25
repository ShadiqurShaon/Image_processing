package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class Make_Histogram {

	
	public static void main(String[] args) throws IOException {
		
		File folder = new File("D:/number/stripe");
		File[] listOfFiles = folder.listFiles();
		int[][] histogram=new int[listOfFiles.length][256];
		int[] temp=new int[256];
		for (int index = 0; index < listOfFiles.length; index++) {
			  File file = listOfFiles[index];
			  if (file.isFile() && file.getName().endsWith(".jpg")) {
		BufferedImage image;
		   int width;
		   int height;
		   
		  
		   image = ImageIO.read(file);
	         width = image.getWidth();
	         height = image.getHeight();
	         
	         int[][] imgval=new int[width][height];
	         
	         for(int i=0; i<height; i++){
	             
	             for(int j=0; j<width; j++){
	             
	                Color c = new Color(image.getRGB(j, i));
	               
	                
	                int red = c.getRed();
	                 int green = c.getGreen();
	                 int blue = c.getBlue() ;
	              
	                int tem=(red+green+blue)/3;
	                imgval[j][i]=tem;
	                //System.out.println(imgval[j][i]);
	              
	             }
	          }
	         
	         
	         for (int k = 0; k < 256; k++) {
	        	 
	         		int count=0;
				for (int k2 = 0; k2 < height; k2++) {
					for (int l = 0; l < width; l++) {
						if(k==imgval[l][k2]){
							count++;
						}
						
					}
					
				}
				//histogram[index][k]=count;
				temp[k]=count;
			}
	        
//	         for (int k = 0; k < listOfFiles.length; k++) {
//	        	 for (int i = 0; i < 256; i++) {
//	        		 System.out.println(i+" "+histogram[k][i]);
//				}
//				System.out.println("////////////////////////////////////////"+k);
//			}
	         System.out.println(file.getName());
	         for (int i = 0; i < 256; i++) {
	        	 histogram[index][i]=temp[i];
	        	// System.out.println(i+" "+temp[i]);
			}
	         
	         System.out.println("////////////////////////////////////////");
	         
	        
			  }
			  
		}
		
		PrintWriter writer = new PrintWriter("D:/number/stripe/set.txt", "UTF-8");
		  
		  for (int j = 0; j < listOfFiles.length; j++) {
			  String s=null; 
			for (int j2 = 0; j2 < 256; j2++) {
				//System.out.println(imageda[j][j2]);
				s=s+j2+"#"+histogram[j][j2]+" ";
				//writer.print(j2+"#"+imageda[j][j2]+" ");
			}
			writer.println(s);
			 //writer.println("/n");
		}
		  writer.close();
		
		
//		for (int i = 0; i < listOfFiles.length; i++) {
//			for (int k = 0; k < 256; k++) {
//				System.out.println(k+" "+histogram[i][k]);
//			}
//		}
		
		
		
		
	}

}
