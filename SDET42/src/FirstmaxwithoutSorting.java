
public class FirstmaxwithoutSorting {

	public static void main(String[] args) 
	{
		/*int[] a= {1,6,7,8,2,5};
		int max=a[0];
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
     System.out.println(max);
	}*/
	
	int[] arr= {10,2,6,8,7,9};
	int fmax=arr[0];
	int smax=arr[0];
	for(int i=0;i<arr.length;i++)
		{
		if(arr[i]<=fmax)   // change symbol for minimum(10>=10,2>=10(false  switch to else if),6>=10(false),
		{
			if(arr[i]!=fmax)    // 10!=10
			{
				smax=fmax;
			}
			fmax=arr[i];      //fmax=10,
		}
		else if(fmax==smax || arr[i]<smax) //change symbol for minimum(2>0,
		{
			smax=arr[i];     //smax=2,smax=6,smax=8,samx=7,smax=9
		}
		}
	System.out.println("first max value "+ fmax);
	System.out.println("second min value "+ smax);
	
	}

}
