package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List <String> list=new ArrayList<>();
		list.add("NY");
		list.add("Michigun");
		list.add("AZ");
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}



	}

}
