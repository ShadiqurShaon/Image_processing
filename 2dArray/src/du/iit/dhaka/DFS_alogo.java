package du.iit.dhaka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS_alogo {

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
	         //Queue queue = new LinkedList();
	         
	         Stack st=new Stack();
	         ArrayList<Integer> output=new ArrayList<Integer>();
	         ArrayList<Integer> visited=new ArrayList<Integer>();
	         
	         st.add(0);
	         output.add(0);
	         visited.add(0);
	         int i=0;
	         int j=0;
	         while(!st.isEmpty()){
	        //for(int x=0;x<10;x++){
	        	
	        	
	        	 
	        	
	        	  
	        	 int temp=(Integer) st.peek();
	        		 
	        	 	
	        			 if(!visited.contains(my2D.get(temp).get(i))){
	 					st.add(my2D.get(temp).get(i));
	 					output.add(my2D.get(temp).get(i));
	 					visited.add(my2D.get(temp).get(i));	
	 					i=0;j=0;
	 					}else {
	 						if(my2D.get(temp).size()-1==j){
	 							i=0;j=0;
	 							int t =(Integer) st.pop();
	 							System.out.println(t);
	 						}else{
	 						j++;i++;}
	 						
	 						
						}
	        			 
	        			 
	        			 System.out.println(st+" "+j+""+i);
	        	 	
	         }
	         
	        
	        		 
	        			
	        	 
	        	 
	        	
	        	 
	        	 
	         for (int x = 0; x < output.size(); x++) {
					System.out.println(output.get(x));
				}
	        	 
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

