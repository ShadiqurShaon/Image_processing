package du.iit.dhaka;

public class CountTransition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myList = {1,1,0,0,1,0,0,1};
		int count=0;
		for (int i = 0; i < myList.length-1; i++) {
			if(myList[i]!=myList[i+1]){
				count++;
			}
			
		}
		System.out.println(count);

	}

}