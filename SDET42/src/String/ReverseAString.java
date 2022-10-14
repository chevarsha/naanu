package String;

public class ReverseAString {

	public static void main(String[] args) 
	{
		String s="chethan";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
	//	System.out.println(rev);
		///////////////////////////////////
		char[] st=s.toCharArray();
		int count=0;
		for(char c: st)
	{
		count++;
	}
		for(int i=count-1;i>=0;i--)
		{
			//System.out.println(st[i]);
		}
		
		////////////////////////////////////
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
	//	System.out.println(sb);
		//////////////////////////////////////////
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
		}
		
		
	}

}
