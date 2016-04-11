package datastructure;
import java.util.LinkedList;
import java.util.Iterator;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList< String> list =new LinkedList<>();
		list.add("NY");
		list.add("CA");
		list.add(" AZ ");

		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());

		}




	}

}
