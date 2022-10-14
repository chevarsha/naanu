package String;

public class PrintPrimeNumberinArray {

	public static void main(String[] args) 
	{
		int a=1010,rem=0,rev = 0,temp;
		while(a!=0)
		{
			rem=a%10;
			rev=rem+rev*10;
			a=a/10;
		}
		System.out.println(rev);
	}

}
