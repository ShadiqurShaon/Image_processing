package lbp.Uniform;

public class CountTransition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myList = {1,1,1,1,0,0,0,};
		int count=0;
		for (int i = 0; i < myList.length-1; i++) {
			if(myList[i]!=myList[i+1]){
				count++;
			}
			
		}
		System.out.println(count);

	}

}