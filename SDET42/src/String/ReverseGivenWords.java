package String;

public class ReverseGivenWords 
{

	public static void main(String[] args) 
	{
		String s="I love Bangalore";
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}	

}
