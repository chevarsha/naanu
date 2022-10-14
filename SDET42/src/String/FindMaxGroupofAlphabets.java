package String;

public class FindMaxGroupofAlphabets 
{

	public static void main(String[] args) 
	{
//		String s[]= {"abcdef","avbcdef","acde","ab"};
//		String maxlenghth=s[0];
//		for(int i=0;i<s.length;i++)
//		{
//			if(s[i].length()>maxlenghth.length()) //6<6  4<6   4<4   2<4
//			{
//				maxlenghth=s[i];                  //6     4     4     2
//			}
//		}
//		for(int i=0;i<s.length;i++)
//		{
//			if(s[i].length()==maxlenghth.length())
//			{
//				System.out.println(s[i]);
//			}
//		}
		
		/////////////////////////////////////////////NUMBERS
		String s[]= {"12345","123456","123","1"};
		String maxlenghth=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxlenghth.length()) //6<6  4<6   4<4   2<4
			{
				maxlenghth=s[i];                  //6     4     4     2
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==maxlenghth.length())
			{
				System.out.println(s[i]);
			}
		}
	}

}
