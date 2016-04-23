import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	private String name;
	public Person2(String Pname) {
		name=Pname;
	}
	@Override
	public int compareTo(Person2 o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
				return name;
	}
}
public class SortLists2 {

	public static void main(String[] args) {

		List<Person2> list=new ArrayList<Person2>();
		SortedSet<Person2> set=new TreeSet<Person2>();

		addElements(list);
		showElements(list);
		Collections.sort(list); // Single argument as comparable is used!
		showElements(list);

		System.out.println("-----------");
		addElements(set);
		showElements(set);
		//Collections.sort(set);
		//showElements(set);
	}

	public static void addElements(Collection<Person2> col)
	{
		col.add(new Person2("Ash"));
		col.add(new Person2("Asdsfs"));
		col.add(new Person2("DFSDsh"));
		col.add(new Person2("DFwD"));
		col.add(new Person2("WDFsh"));
		col.add(new Person2("GQsh"));
	}

	public static void showElements(Collection<Person2> col) {
		System.out.println(col);
	}


}

