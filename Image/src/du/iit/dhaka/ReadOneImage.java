package du.iit.dhaka;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ReadOneImage {

	
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		
		BufferedImage image;
		   int width;
		   int height;
		   
		   File file=new File("smiley.png");
		   image = ImageIO.read(file);
	         width = image.getWidth();
	         height = image.getHeight();
		   
	         for(int i=0; i<height; i++){
	             
	             for(int j=0; j<width; j++){
	             
	                Color c = new Color(image.getRGB(j, i));
	                //System.out.println("S.No: " +count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
	                
	                int imageVlaue=c.getBlue()+c.getGreen()+c.getRed();
	                
	                arr.add(imageVlaue);
	                
	             }
	          }
	         //System.out.println(arr.size());
	         
	         
	         
	         
	         File folder = new File("D:/number");
	         File[] listOfFiles = folder.listFiles();
	        
	         
	         for (int i1 = 0; i1 < listOfFiles.length; i1++) {
	        	 File file1 = listOfFiles[i1];
	        	 ArrayList<Integer> compareArr= new ArrayList<Integer>();
		         ArrayList<Integer> compareRsult= new ArrayList<Integer>();
		         
	 			  if (file1.isFile() && file1.getName().endsWith(".txt")) { 
	 				 
	 				  Scanner sc=new Scanner(file1);
	 		         
	 		         while(sc.hasNext()){
	 		        	//System.out.println( sc.nextInt());
	 		        	 compareArr.add(sc.nextInt());
	 		         }
	 		         //System.out.println(compareArr.size());
	 		         
	 		         for(int i=0;i<arr.size();i++){
	 		        	 
	 		        	// System.out.println(arr.get(i));
	 		        	 int temp=compareArr.get(i)-arr.get(i);
	 		        	 compareRsult.add(temp);

	 		         
	 		         }
	 		         int tem2=0;
	 		         for(int i=0;i<arr.size();i++){
	 		        	 
	 		        	 tem2=tem2+compareRsult.get(i);
	 			        	//System.out.println(compareRsult.get(i)); 
	 			        	// compareRsult.add(arr.get(i)-compareArr.get(i));
	 			         }
	 		         
	 		         
	 		         
	 		         System.out.println(tem2);
	 				  
	 			  }
	        	 
	         }
	         
	         
	         
	         
	         
//	 		
//	 		
//	 		for (int i = 0; i < listOfFiles.length; i++) {
//	 			  File file1 = listOfFiles[i];
//	 			  if (file1.isFile() && file1.getName().endsWith(".txt")) {
//	 				 ArrayList<Integer> arrtem = new ArrayList<Integer>();
//	 				 ArrayList<Integer> arrtem2 = new ArrayList<Integer>();
//	 				  Scanner sc=new Scanner(file1);
//	 				
//	 				 while(sc.hasNextInt()){
//	 					 //System.out.println(sc.nextInt());
//	 					 arrtem.add(sc.nextInt());
//	 				 }
//	 				 
//	 				 for(int i1=0;i1<arr.size();i1++){
//	 					 
//	 					 arrtem2.add(arrtem.get(i1)-arr.get(i1));
//	 				 }
//	 				 
//	 				 
//	 				 			int val=0;
//	 				 for(int i2=0;i<arrtem2.size();i2++){
//	 					// val=val+arrtem2.get(i2);
//	 					 //System.out.println(val);
//	 				 }
	 				 
	 				// System.out.print(file1.getName()+" ");
	 				 
	 			  }
	 			  
	 		}
	         
	         
	         
	         
	         
	         
	         
		
//		Scanner sc=new Scanner(file);
//		
//		 while(sc.hasNextInt()){
//			 //System.out.println(sc.nextInt());
//			 arr.add(sc.nextInt());
//		 }
//		 
//		 System.out.println(arr.size());
//	}

//}
