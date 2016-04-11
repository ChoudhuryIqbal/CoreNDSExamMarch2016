package datastructure;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Map <String,String> map=new LinkedHashMap<>();
		map.put("USA","ny");
		map.put("Australia","Melbourne");
		map.put("Canada","Montreal");


		for(Map.Entry<String,String> cursor: map.entrySet()){
			System.out.println("Key: "+cursor.getKey()+" "+"value: " +cursor.getValue());
		}

	}

}
