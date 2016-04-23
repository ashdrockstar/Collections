import java.util.HashMap;
import java.util.Map.Entry;

public class HashMp {

	/*
	 * Order is not always sorted!
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(7, "Sev");
		map.put(9, "Nine");
		map.put(2, "Two");
		for(String values: map.values())
		{
			System.out.println(values);
		}
		
		for(Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println(map.get(8));
	}

}
