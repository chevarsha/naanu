package String;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) 
	{
		for(;;)
		{
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			//int num=15;
			int a=0,b=1,count=0;
			if(num==a || num==1)
			{
				System.out.println("not a prime number");
			}
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				else if(count>0)
				{
					System.out.println("not a prime");
				}
				else
				{
					System.out.println("prime");
					break;
				}
			}
		}
  	}
}
