package du.iit.dhaka;

import java.io.File;

import javax.swing.JOptionPane;

public class GuiInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		File folder = new File("D:/number/stripe");
//		File[] listOfFiles = folder.listFiles(); 
//		
//		for (int i = 0; i < listOfFiles.length; i++) {
//			  File file = listOfFiles[i];
//			  String s=file.getName();
//			  if(s.contains(args[0])){
//				  System.out.println("FOUND BOSSS");
//			  }
			 GuiInputOt ot=new GuiInputOt();
			 ot.print(args[0]);
			  
	//	}
		//System.out.println(args[0]);
		
//		int length = args.length;
//		String s=null;
//	     for (int i = 0; i < length; i++) {
//	          s=s+args[i];
//	     }
//     System.out.println(s);
	}

}
