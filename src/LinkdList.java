import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>(); // Add/Remove in ending
		LinkedList<Integer> linkedList=new LinkedList<Integer>(); // Add/Remove in beginning or in between
		check("ArrayList",arrayList);
		check("LinkedList",linkedList);
	}

	public static void check(String type,List<Integer> list)
	{
		System.out.println(type);
		for(int i=0;i<1E5;i++)
		{
			list.add(i);
		}
		long start=System.currentTimeMillis();

		//Add in the ending
		for(int i=0;i<1E5;i++)
		{
			list.add(i);
		}

		//		//Add in the beginning
		//		for(int i=0;i<1E5;i++)
		//		{
		//			list.add(0,i);
		//		}

		//		//Add somewhere else
		//		for(int i=0;i<1E5;i++)
		//		{
		//			list.add(100,i);
		//		}
		

		long end=System.currentTimeMillis();

		System.out.println("Time: "+(end-start)+"ms");
	}

}
