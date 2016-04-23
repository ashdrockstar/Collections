import java.util.ArrayList;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(7);
		
		System.out.println("Number @3: "+numbers.get(3));
		numbers.remove(0);
		for(Integer value:numbers){
			System.out.println(value);
		}
		System.out.println("Size: "+numbers.size());
		
		List<String> list=new ArrayList<String>();
		
	}

}
