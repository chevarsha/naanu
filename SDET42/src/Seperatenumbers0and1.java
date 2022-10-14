
public class Seperatenumbers0and1 {

	public static void main(String[] args) 
	{
		int[] a= {0,1,1,0,1,0};
		int[] temp=new int [a.length];
        int m=0;
        int n=a.length-1;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==0)        ///if we have to sort for any numbers !=0
        	{
        		temp[m]=0;     /// we have to add a[i] 
        		m++;
        	}
        	else if(a[i]==1)
        	{
        		temp[n]=1;
        		n--;
        	}
        }
        for(int i=0;i<temp.length;i++)
        	System.out.print(temp[i]+" ");

	}

}
