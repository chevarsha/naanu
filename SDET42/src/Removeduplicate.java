import java.util.LinkedHashSet;

public class Removeduplicate {

	public static void main(String[] args) 
	{
		int a[]= {2,4,5,5,3,9,9,7};
		
		LinkedHashSet<Integer> e=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			e.add(a[i]);
		}
		System.out.println(e);
	}

}
