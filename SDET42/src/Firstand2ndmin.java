
public class Firstand2ndmin {

	public static void main(String[] args) 
	{
		{
		int[] arr= {2,3,9,1,5};
		int fmin=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++)
			{
			if(arr[i]<=fmin)   // change symbol for minimum(10>=10,2>=10(false  switch to else if),6>=10(false),
			{
				if(arr[i]!=fmin)    // 10!=10
				{
					smin=fmin;
				}
				fmin=arr[i];      //fmax=10,
			}
			else if(fmin==smin || arr[i]<smin) //change symbol for minimum(2>0,
			{
				smin=arr[i];     //smax=2,smax=6,smax=8,samx=7,smax=9
			}
			}
		System.out.println("first min value "+ fmin);
		System.out.println("second min value "+ smin);
		
		}

	}

}
