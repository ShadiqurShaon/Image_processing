package du.iit.dhaka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountAccurate {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("C:/Users/Shaon/Desktop/face/list.txt"));
		int in=0;
		while(scanner.hasNext()){
			double i=scanner.nextDouble();
			if(i==1.0){
			System.out.println(i);
			in++;
			}
		}
		System.out.println(in);

	}

}