package Maps;
import java.util.TreeMap;
public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap t = new TreeMap();
		t.put(107, "Kate");
		t.put(115, "Luis");
		t.put(103, "Jacob");
		t.put(123, "Robin");
		t.put(105, "Alexa");
		t.put(111, "Groot");
		t.put(101, "Paul");
		
		System.out.println(t);
		
		//Returns the key greater than or equal to the given key, or null if there is no such key.
		System.out.println("Greater Key: "+t.ceilingKey(104));
		
		//Returns the key lower than or equal to the given key,or null if there is no such key.
		System.out.println("Lower Key: "+t.floorKey(112));
		
		//Returns a entry greater than or equal to the given key, or null if there is no such key.
		System.out.println("Greater Entry: "+t.ceilingEntry(104));
		
		//Returns a entry lower than or equal to the given key, or null if there is no such key.
		System.out.println("Lower Entry: "+t.floorEntry(114));
		
		//Return the entries less than given key
		System.out.println("Entries less than given key: "+t.headMap(108));
		
		//Returns a Set view of the keys contained in this map. 
		System.out.println("A set of Keys: "+t.keySet());
		
		//Returns a reverse order of entries
		System.out.println("Reverse Order Entries: "+t.descendingMap());
		
		//Returns a set of sequenced values
		System.out.println("Set of sequenced values: "+t.sequencedValues());
	}
}