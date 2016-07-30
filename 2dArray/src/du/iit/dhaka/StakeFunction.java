package du.iit.dhaka;

import java.util.Stack;

public class StakeFunction {
	
	static void showpush(Stack st,int a){
		
		st.push(a);
		System.out.println("showPush:----"+a);
		System.out.println("stack"+st);
	
	}
	
	static void showpop(Stack st,int a){
		
		Integer a1= (Integer) st.pop();
		System.out.println("popstack "+a1);
		System.out.println("stack"+st);
	}
	
	public static void main(String args[]){
		
		Stack st=new Stack();
		showpush(st, 10);
		showpush(st, 20);
		showpush(st, 30);
		showpush(st, 40);
		showpush(st, 50);
		
		showpop(st, 50);
		showpop(st, 40);
		showpop(st, 30);
	}
}
