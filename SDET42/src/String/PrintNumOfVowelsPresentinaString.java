package String;

public class PrintNumOfVowelsPresentinaString {

	public static void main(String[] args) 
	{
		String str="chethan";
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]);
			}
		}
		System.out.print(count);

	}

}
