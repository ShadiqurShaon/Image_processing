package feature.lbp;
import java.io.IOException;


public class MainMethod {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		LbpTest main=new LbpTest();
		main.LBP();
		
		Test123 test=new Test123();
		test.predict();
		
	}

}
