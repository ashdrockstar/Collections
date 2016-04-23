import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * Comparator->Interface , compare->unimplemented method, compareTo->Implemented method
 */
class Guy{
	int id;
	String name;

	public Guy(int Gid,String Gname) {
		id=Gid;
		name=Gname;
	}

	@Override
	public String toString() {
		return id+":"+name;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}
class StringLengthComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		if(o1.length()==o2.length())
			return 0;
		else if(o1.length()<o2.length())
			return -1;
		else
			return 1;
	}
}


class ReverseAlphabeticalComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}
}
public class SortLists {

	public static void main(String[] args) {
		List<String> animals=new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("monkey");
		animals.add("tiger");
		animals.add("lion");
		Collections.sort(animals);
		System.out.println(animals);

		Collections.sort(animals,new StringLengthComparator());
		System.out.println(animals);

		Collections.sort(animals,new ReverseAlphabeticalComparator());
		System.out.println(animals);
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(3);
		numbers.add(80);
		numbers.add(2);
		Collections.sort(numbers);
		System.out.println(numbers);

		List<Guy> guyz=new ArrayList<Guy>();
		guyz.add(new Guy(1,"Asds"));
		guyz.add(new Guy(9,"sassds"));
		guyz.add(new Guy(7,"Bsds"));
		guyz.add(new Guy(2,"Zsds"));
		guyz.add(new Guy(3,"Psds"));

		System.out.println(guyz);
		Collections.sort(guyz,new Comparator<Guy>(){

			@Override
			public int compare(Guy o1, Guy o2) {
//				if(o1.name.length()<o2.name.length())
//					return -1;
//				else if(o1.name.length()>o2.name.length())
//					return 1;
//				return 0;
				return o1.getName().compareTo(o2.getName());
			}


		});
		System.out.println(guyz);
	}

}
