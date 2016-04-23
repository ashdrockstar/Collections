import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		/* HashSet is unordered i.e. random!
		 * LinkedHashSet is ordered by addition of elements!
		 * TreeSet is ordered by natural order!
		 */
		//Set<String> set1=new HashSet<String>();
		//Set<String> set1=new LinkedHashSet<String>();
		Set<String> set1=new TreeSet<String>();
		set1.add("a");
		set1.add("fd");
		set1.add("sa");
		set1.add("s");
		set1.add("gf");
		set1.add("s"); // duplicate
		System.out.println(set1);
		
		if(set1.contains("ssss"))
			System.out.println("Contains sss");
		else
			System.out.println("Can't find sss");
		
		if(set1.isEmpty())
			System.out.println("Empty set");
		else
			System.out.println("NonEmpty set");
		//Remove
		set1.remove("s");
		System.out.println(set1);
		
		//Intersection
		Set<String> set2=new TreeSet<String>();
		set2.add("a");
		set2.add("fd");
		set2.add("sa");
		set2.add("s");
		set2.add("monkey");
		Set<String> intersection=new HashSet<String>(set1);
		System.out.println("Set1: "+set1);
		System.out.println("Set2: "+set2);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection);
		
		//Difference
		Set<String> difference=new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println("Difference: "+difference);
		
		//Union
		Set<String> union=new HashSet<String>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);
	}

}
