
public class SortingDescending
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};

		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)  //1
			{
				if(arr[i]<arr[j])      //for ascending or descending we have to change the sign 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]); 
		}
		System.out.println("max "+arr[arr.length-3]);  //to print maximum
		System.out.println("min "+ arr[2]);   //to print minimum number 
		
		
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("first 3 addition after sorting "+sum);
		
	}
}	
