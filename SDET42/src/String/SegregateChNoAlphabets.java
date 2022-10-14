package String;

public class SegregateChNoAlphabets {

	public static void main(String[] args) 
	{
		String st="77&&uu";
		String alpha=" ";
		String num=" ";
		String spc=" "; 
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='a'&& st.charAt(i)<='z' ||st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				alpha=alpha+st.charAt(i);
			}
			else if(st.charAt(i)>='0'&& st.charAt(i)<='9')
			{
			num=num+st.charAt(i);
			}
			else
			{
				spc=spc+st.charAt(i);
			}
		}
		System.out.println("we have "+alpha+num+spc);
	}

}
