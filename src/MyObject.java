import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


// Comparing to objects to be same or not on the basis of hashcode
class Person{
	private int id;
	private String name;
	public Person(int Pid,String Pname) {
		id=Pid;
		name=Pname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return id+" : "+name;
	}
	public int getId()
	{
		return this.id;
	}
}
public class MyObject {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);

		for(String key:map.keySet())
		{
			System.out.println(map.get(key));
		}

		Set<String> set=new LinkedHashSet<String>();
		set.add("cat");
		set.add("dog");
		set.add("mouse");
		set.add("cat");
		System.out.println(set);

		Map<Person,Integer> mapNew=new LinkedHashMap<Person,Integer>();
		Set<Person> setNew=new LinkedHashSet<Person>();
		Person p1=new Person(1,"A");
		Person p2=new Person(2,"B");
		Person p3=new Person(3,"C");
		Person p4=new Person(3,"C");
		mapNew.put(p1,1);
		mapNew.put(p2,2);
		mapNew.put(p3,3);
		mapNew.put(p4,4);
		setNew.add(p1);
		setNew.add(p2);
		setNew.add(p3);
		setNew.add(p4);

		for(Person key:mapNew.keySet())
		{
			System.out.println(map.get(key));
		}

		System.out.println(setNew);

	}

}
