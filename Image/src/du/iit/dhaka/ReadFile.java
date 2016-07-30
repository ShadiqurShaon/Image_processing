package du.iit.dhaka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		File folder = new File("D:/number");
		File[] listOfFiles = folder.listFiles();
		//System.out.println(listOfFiles.length);
		for (int i = 0; i < listOfFiles.length; i++) {
		  File file = listOfFiles[i];
		  if (file.isFile() && file.getName().endsWith(".txt")) {
//			  Scanner scanner = new Scanner(file);
//			  while(scanner.hasNextInt()){
//				  System.out.println(scanner.nextInt());
//			  }
			  String s=file.getName();
			  System.out.println(s);
			  PrintWriter writer = new PrintWriter(s, "UTF-8");
			  writer.println("The first line");
			  writer.println("The second line");
			  writer.close();
		  } 
		}
		

	}

}
