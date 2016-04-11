package datastructure;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Stack <String> stack=new Stack<>();
		stack.push("Co");
		stack.push("Fl");
		stack.push("NJ");

		System.out.println(stack.peek());
		System.out.println(stack.pop());

	}

}
