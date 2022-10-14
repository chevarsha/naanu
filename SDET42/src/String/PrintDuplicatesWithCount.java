package String;

import java.util.LinkedHashSet;

public class PrintDuplicatesWithCount {

	public static void main(String[] args) 
	{

		String str="I Love I Love Bangalore city";
		String[] s=str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String stri:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(stri.equals(s[i]))
				{
					count++;
				}
				if(count>1)
				{
					System.out.print(stri+" is repeating "+count+" time");
					break;
				}
			}
		}
	}

}
