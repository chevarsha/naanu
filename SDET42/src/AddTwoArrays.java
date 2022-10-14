
public class AddTwoArrays {

	public static void main(String[] args) 
	{
		int a[]= {2,3,1,5,2};
		int b[]= {1,4,3,2};
        int c[];
        
        if(a.length>=b.length)
        {
        	c=new int[a.length];
        	for(int i=0;i<a.length-1;i++)
        	//i=o 0<5True,i=1 1<5 True,i=2 2<5,i=3 3<5,i=4 4<5
        	{
        		if(i<b.length)
        		{
        			c[i]=a[i]+b[i];
        		}
        		else
        		{
        			c[i]=a[i];
        		}
        	}
        	for(int i=0;i<c.length;i++)
        	{
        		System.out.println(c[i]+" ");
        	}
        }
//		int length=a.length;
//		if(a.length<b.length)
//		{
//			length=b.length;
//		}
//		for(int i=0;i<length;i++)
//		{
//			try 
//			{
//				System.out.println(a[i]+b[i]); //5 4 4 7
//			}
//			catch(Exception e)
//			{
//				if(a.length<b.length)
//				{
//					System.out.println(b[i]);
//				}
//				else
//				{
//					System.out.println(a[i]);
//				}
//			}
//		}
	}
}
