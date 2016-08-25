package du.iit.dhaka;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		File folder = new File("D:/number");
		//File[] listOfFiles = folder.listFiles();
		//System.out.println(listOfFiles.length);
		//for (int i = 0; i < listOfFiles.length; i++) {
		 // File file = listOfFiles[i];
		 // if (file.isFile() && file.getName().endsWith(".txt")) {
//			  Scanner scanner = new Scanner(file);
//			  while(scanner.hasNextInt()){
//				  System.out.println(scanner.nextInt());
//			  }
			 // String s=file.getName();
			 // System.out.println(s);
//			  PrintWriter writer = new PrintWriter("D:/number/FUCk.txt", "UTF-8");
//			  writer.println("is it done");
//			  writer.println("what is wrong");
//			  writer.close();
		  Writer writer = new BufferedWriter(new OutputStreamWriter(
			        new FileOutputStream("D:/number/FUCk.txt", true), "UTF-8"));
		  writer.append("OK i am done!!!! \n");
		  writer.close();
		
		  //} 
		}
		

	}


