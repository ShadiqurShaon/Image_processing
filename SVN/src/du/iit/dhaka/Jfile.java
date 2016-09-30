package du.iit.dhaka;

import java.io.File;

import javax.swing.JFileChooser;



public class Jfile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFileChooser fc=new JFileChooser();
		 fc.showOpenDialog(fc);
		//File file = fc.getSelectedFile();
		//String s=fc.getSelectedFile();
		 File file=fc.getCurrentDirectory();
		System.out.println(file);

	}

}
