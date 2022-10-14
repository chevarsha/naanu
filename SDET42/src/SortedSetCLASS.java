import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCLASS {

	public static void main(String[] args) 
	{
		SortedSet<String> set=new TreeSet<>();
		set.add("infosys");
		set.add("IBM");
		set.add("Google");
		set.add("Microsoft");
		set.add("Cognizant");
		System.out.println(set);
		for(String str:set)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("infosys"));
		System.out.println(set.tailSet("Google"));
	}

}
