package Maps;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer , String> h = new HashMap();
		h.put(01, "Jason");
		h.put(02, "Mark");
		h.put(03, "Aron");
		h.put(04, "Brock");
		System.out.println(h);
		
		//h.entrySet returns a Set containing the entries (key-value pairs) of the HashMap.
		//For h.entrySet() we need to provide Generic
		for(Map.Entry me : h.entrySet())
		{
			System.out.println(me.getKey()+" -> "+me.getValue());
		}
	}
}
