package du.iit.dhaka;

import java.security.PublicKey;

public class Recarsion {

	public static int recursive(int i){
		
		if(i == 0) {
		      return 0;
		   }
			
		   if(i == 1) {
		      return 1;
		   }
		   return recursive(i-1) + recursive(i-2);
		//System.out.println(number);
//		int i=recursive(number-1);
//		System.out.println(i);
		//return number+recursive(number-1);
		
	}
	public static void main(String[] args) {
		
	//System.out.println(recursive(5));
		//recursive(3);	
		 for (int i = 0; i < 10; i++) {
		      System.out.println( recursive(i));
		   }	
		

	}

}
