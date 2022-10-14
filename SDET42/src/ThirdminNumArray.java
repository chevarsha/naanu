
public class ThirdminNumArray 
{
	public static void main(String[] args) 
	{
	    int[] arr= {4,1,3,2,5};
		int smin=arr[0];
		int tmin=arr[0];
		for(int i=2;i<arr.length;i++)
			{
			if(arr[i]<=tmin)   // change symbol for minimum(10>=10,2>=10(false  switch to else if),6>=10(false),
			{
				if(arr[i]!=smin)    // 10!=10
				{
					tmin=smin;
				}
				smin=arr[i];      //fmax=10,
			}
			else if(smin==tmin || arr[i]<tmin) //change symbol for minimum(2>0,
			{
				smin=arr[i];     //smax=2,smax=6,smax=8,samx=7,smax=9
			}
			}
		System.out.println("second min value "+ smin);
		System.out.println("third min value "+ tmin);
	}
}



