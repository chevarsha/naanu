package String;

import java.util.LinkedHashSet;

public class OccurenceOfNum {

	public static void main(String[] args) 
	{
		int[] a= {4,3,2,3,1};
//		boolean[] st=new boolean[a.length];
//		for(int i=0;i<a.length;i++)
//		{
//			if(st[i]==false)
//			{
//				int count=1;
//				for(int j=i+1;j<a.length;j++)
//				{
//					if(a[i]==a[j])
//					{
//						count++;
//						st[j]=true;
//					}
//				}				
//				System.out.println(a[i]+" "+count);
//   			}
//		}
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(int num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					count++;
				}
			}
			System.out.println(num+"is repeating "+count+" times");
		}
	}
}
