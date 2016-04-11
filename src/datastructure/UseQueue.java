package datastructure;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue <String> queue=new LinkedList<>();
		queue.add("MA");
		queue.add("MS");
		queue.add("Ny");
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());

	}

}
