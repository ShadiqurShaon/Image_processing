package ltp.feature.extract;

import java.io.IOException;



public class Ltptestmain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LtpTest main=new LtpTest();
		main.LTP();
		
		Test123 test=new Test123();
		test.predict();

	}

}
