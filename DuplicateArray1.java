public class DuplicateArray1 
{

	public static void main(String[] args) 
	{
		int arr[]= {22,100,9,18,6,22,13,9,100};
		
		System.out.println("duplicate element present in given array");
		
		for (int i =0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if (arr[i]==arr[j]) 
				{
					System.out.println(arr[j]);
				} 
			}
		}

	}

}
