package String;

public class PrintDuplicateNumWithCount 
{
	public static void main(String[] args) 
	{int[] a= {4,3,2,3,1};
	boolean[] st=new boolean[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(st[i]==false)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					st[j]=true;
				}
			}				
			if(count>=2)
			{
				System.out.println(a[i]+" "+count);

			}
			}
	}
		
	}

}
