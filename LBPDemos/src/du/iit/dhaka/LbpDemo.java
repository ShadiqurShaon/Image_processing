package du.iit.dhaka;

public class LbpDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[ ][ ] aryNumbers = new int[3][3];
		int[ ][ ] binary = new int[3][3];
	
		aryNumbers[0][0]=6;
		aryNumbers[0][1]=43;
		aryNumbers[0][2]=4;
		aryNumbers[1][0]=21;
		aryNumbers[1][1]=15;
		aryNumbers[1][2]=49;
		aryNumbers[2][0]=16;
		aryNumbers[2][1]=31;
		aryNumbers[2][2]=22;
		
	
		
		
		
		
//		for (int i = 0; i < aryNumbers.length; i++) {
//			for (int j = 0; j < aryNumbers.length; j++) {
//				System.out.println(i+""+j+" "+aryNumbers[i][j]);
//			}
//			
//		}
			
		for (int i = 0; i < aryNumbers.length; i++) {
			for (int j = 0; j < aryNumbers.length; j++) {
				if(!(i==1&&j==1)){
					//System.out.println(i+""+j+" "+aryNumbers[i][j]);
					if(aryNumbers[i][j]>=aryNumbers[1][1]){
						binary[i][j]=1;
					}else{binary[i][j]=0;}
				}else{binary[1][1]=aryNumbers[1][1];}
				
			}
			
		}
				int[] binaryarray=new int[8];
				int flag=0;
		for (int i = 0; i < aryNumbers.length; i++) {
			for (int j = 0; j < aryNumbers.length; j++) {
				System.out.println(i+""+j+" "+binary[i][j]);
				if(!(i==1&&j==1)){
				
					binaryarray[flag]=binary[i][j];
					flag++;
				}
			}
			
		}
		
		
//		for (int i = 0; i < binaryarray.length; i++) {
//			System.out.println(binaryarray[i]);
//		}
//		String s=Arrays.toString(binaryarray);
//		int decimal = Integer.parseInt(s, 2);
		String s=null;
		String y = "0";
		for(int i=0;i<binaryarray.length;i++){
		s=String.valueOf(binaryarray[i]);
		
		 y=y+s;
		
		}
		 int decimalNumber = Integer.parseInt(y,2);
		//System.out.println(decimalNumber);
	}

}
