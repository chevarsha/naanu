package String;

import java.util.LinkedHashSet;

public class NumofOvelsInaStringWithoutDuplicate {

	public static void main(String[] args) 
	{
		String str="india";
		int count=0;
		char[]ch=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(char ch1:set)
		{
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
			{
				count++;		
				System.out.println(ch1);
			}
		}
		System.out.println(count);
	}
}
