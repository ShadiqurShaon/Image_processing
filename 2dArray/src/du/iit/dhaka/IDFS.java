package du.iit.dhaka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IDFS {
	
 public static void main(String args[]) throws IOException{
         
		 ReadTxtFile re=new ReadTxtFile();
		 int[][] number= new int[10][10];
		 int[][] ad=new int[10][10];
		 	number=re.arr();
		 	ArrayList<ArrayList<Integer>> my2D = new ArrayList<ArrayList<Integer>>();
		 	
	         
	         for (int i = 0; i <10; i++) {
	        	 my2D.add(new ArrayList<Integer>());
	        	 int y=0;
	        	 for (int j = 0; j < 10; j++) {
	        		 
	        		 int x=number[i][j];
	        		 //System.out.print(number[i][j]);
	        		if(x==1){
	        			my2D.get(i).add(j);
	        			y++;
	        		}
	        		 
				}
	        	 System.out.println('\n');
	        
			}
	         Queue queue = new LinkedList();
	         ArrayList<Integer> output=new ArrayList<Integer>();
	         ArrayList<Integer> visited=new ArrayList<Integer>();
	         
	         queue.add(0);
	         output.add(0);
	         visited.add(0);
	       int gool=9;
	         int depth=0;
	         int needtempvar=0;
	         while(!queue.isEmpty()){
	        //for(int x=0;x<10;x++){
	        	 
	        	 int temp=(Integer) queue.peek();
	        	 
	        	  // visited.add(temp);
	        		 
	        		 for (int i = 0; i < my2D.get(temp).size(); i++) {
		        		 
	        			 if(!visited.contains(my2D.get(temp).get(i))){
	 					queue.add(my2D.get(temp).get(i));
	 					output.add(my2D.get(temp).get(i));
	 					visited.add(my2D.get(temp).get(i));
	 					
	 						if(my2D.get(temp).get(i)==gool){
	 							needtempvar=my2D.get(temp).get(i);
	 							break;
	 						}
	 					
	 					}
	        			 
	        			 
	 				}
	        		 
	        		 
	        		 depth++;
	        		 
	        	 queue.remove();
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 System.out.println(queue +" "+depth);
	        	 
	        	 if(needtempvar==gool){
        			 break;
        		 }
	         }
	        	
	       
	         
	         
	         for (int i = 0; i < output.size(); i++) {
				System.out.println(output.get(i));
			}
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
//	         for ( int i = 0;i<10; i++) {
//
//	 			for (int j = 0; j < my2D.get(i).size(); j++) {
//	 				
//	 				 System.out.print(my2D.get(i).get(j));
//	 				
//	 			}
//	 			System.out.println('\n');
//	 			
//	 		}
	         
	         
	         
	         
	         
	    }

}
