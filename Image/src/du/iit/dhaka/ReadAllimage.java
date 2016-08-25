package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class ReadAllimage {

	
public static void main(String[] args) throws IOException {
		
		
		File folder = new File("D:/number/stripe");
		File[] listOfFiles = folder.listFiles();
		int[][] imageda=new int[listOfFiles.length][300*300];
		//System.out.println(listOfFiles.length);
		for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".jpg")) {
//			  Scanner scanner = new Scanner(file);
//			  while(scanner.hasNextInt()){
//				  System.out.println(scanner.nextInt());
//			  }
			  BufferedImage image;
			   int width;
			   int height;
			   try {
			         //File input = new File("smiley.png");
			         image = ImageIO.read(file);
			         width = image.getWidth();
			         height = image.getHeight();
			         String s=file.getName();
			         System.out.println(s);
			         String[] result = s.split("\\.(?=[^\\.]+$)");
			         System.out.println(result[0]);
			         s=result[0]+".txt";
			         System.out.println(s);
			         PrintWriter writer = new PrintWriter("D:/number/stripe/"+s, "UTF-8");
			         int count = 0;
			         
			         for(int i1=0; i1<height; i1++){
			         
			            for(int j=0; j<width; j++){
			            
			               count++;
			               Color c = new Color(image.getRGB(j, i1));
			               System.out.println("S.No: " +count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
			               int value=c.getRGB();
			              // writer.println("S.No: " +count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
			               writer.print(value);
			               imageda[i][count]=value;
			            }
			            count++;
			            //writer.println("/n");
			         }
			         //writer.close();
			         
			      } catch (Exception e) {}
			   
			  
//			  System.out.println(s);
//			  
//			  
//			  writer.println("The second line");
			   
			 
			   
			   
			   
			  
		  } 
		}
		
		
		PrintWriter writer = new PrintWriter("D:/number/stripe/set.txt", "UTF-8");
		  
		  for (int j = 0; j < 3; j++) {
			  String s=null; 
			for (int j2 = 0; j2 < 60; j2++) {
				//System.out.println(imageda[j][j2]);
				s=s+j2+"#"+imageda[j][j2]+" ";
				//writer.print(j2+"#"+imageda[j][j2]+" ");
			}
			writer.println(s);
			 //writer.println("/n");
		}
		  writer.close();

	}

}
