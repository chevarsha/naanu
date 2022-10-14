import java.util.Scanner;

public class NumDivisibleby3n5 {

	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%3==0 && a%5==0)
		{
			System.out.println("hi hello");
		}
		else if(a%3==0)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("bye");
		}

	}

}
