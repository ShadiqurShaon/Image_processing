import java.io.IOException;


public class MainMethod {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		LbpMain main=new LbpMain();
		
		main.Lbp();
		Test123 test=new Test123();
		test.predict();
		
	}

}