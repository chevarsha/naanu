
public class OrderofOccurenceArray {

	public static void main(String[] args) 
	{
		int[]a= {1,1,2,3,4,6};
		
		boolean rs[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(rs[i]==false)
			{
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						rs[j]=true;
					}
				}
				System.out.println(a[i]+"="+count);
			}
		}
	}

}
