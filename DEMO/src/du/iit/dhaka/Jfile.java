package du.iit.dhaka;

import java.io.File;

import javax.swing.JFileChooser;



public class Jfile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFileChooser fc=new JFileChooser();
		int returnVal = fc.showOpenDialog(fc);
	//fc.setCurrentDirectory(new java.io.File("."));
		File s=fc.getCurrentDirectory();
		System.out.println(s);

	}

}
