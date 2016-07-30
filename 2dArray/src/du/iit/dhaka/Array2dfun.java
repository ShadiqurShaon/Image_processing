package du.iit.dhaka;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Array2dfun {
	
	public static void main(String args[]){
//		
//		int[][] values= new int[5][5];
//	for (int i = 0; i < values.length; i++) {
//		for (int j = 0; j < values.length; j++) {
//			values[i][j]=j;
//		}
//	}
//	values[4][0]=1;
//	values[3][1]=1;
//	values[2][2]=1;
//	values[1][3]=1;
//	values[0][4]=1;
	
//		int x=values.length;
//	for (int i = 0; i < values.length; i++) {
//		int[] sub = values[i];
//		for (int j =0 ; j < x; j++) {
//			System.out.print(sub[j] + " ");
//			
//		}
//		x--;
//		System.out.println("\n");
//	}
//	
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<ArrayList<Integer>> my2D = new ArrayList<ArrayList<Integer>>();
//		
//		for ( int i = 0; i < 5; i++) {
//			my2D.add(new ArrayList<Integer>());
//			for (int j = 0; j < 10; j++) {
//				
//				my2D.get(i).add(1);
//				
//			}
//			//list.add(1);
//		}
//		
//		for ( int i = 0;i<5; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print(my2D.get(i).get(j));
//				//System.out.println(list.get(i));
//			
//			
//		}
//			System.out.println('\n');
//	}
		
		
		
		Queue queue = new LinkedList();
		
		queue.add("Java");
	    queue.add(".NET");

	    queue.add("Javascript");
	    queue.add("HTML5");
	    queue.add("Hadoop");
	    queue.add(1);
	    
	   
	    
	    System.out.println(queue.poll());
	    System.out.println(queue);
	}
	}

