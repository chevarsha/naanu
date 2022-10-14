package String;

public class FindMinGroupofAlphabets 
{

	public static void main(String[] args) 
	{
		String s[]= {"abcdef","avbc","acde","ab"};
		String minlenghth=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<minlenghth.length()) //6<6  4<6   4<4   2<4
			{
				minlenghth=s[i];                  //6     4     4     2
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==minlenghth.length())
			{
				System.out.println(s[i]);
			}
		}
	}
}
