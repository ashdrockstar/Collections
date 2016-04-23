import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortdMp {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		LinkedHashMap<Integer, String> linkedMap=new LinkedHashMap<Integer,String>();
		TreeMap<Integer, String> treeMap=new TreeMap<Integer,String>();

		System.out.println("HashMap");
		testMap(map);
		System.out.println("LinkedList");
		testMap(linkedMap);
		System.out.println("TreeMap");
		testMap(treeMap);


	}

	public static void testMap(Map<Integer,String> map)
	{
		long start,end;
		
		start=System.currentTimeMillis();
		for(int i=0;i<=15;i++)
		{
			
			map.put(i, i+"a");
		}
		end=System.currentTimeMillis();
		System.out.println(end-start);
		
		for(Integer key: map.keySet())
		{
			System.out.println(map.get(key));
		}
		//		for(Entry<Integer,String> entry: map.entrySet())
		//		{
		//			System.out.println(entry.getKey()+" : "+entry.getValue());
		//		}
	}

}
