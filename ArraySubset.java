public class ArraySubset
{
    static boolean isSubset(int arr[], int arr1[], int p, int q)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < q; i++) {
            for (j = 0; j < p; j++)
                if (arr1[i] == arr[j])
                    break;
            if (j == p)
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        int arr1[] = { 3,9,4,8,1,7,2,6};
        int arr2[] = { 2,9,1,3};
 
        int p = arr1.length;
        int q = arr2.length;
        
        System.out.println("Is Array subset of another Array");
 
	        if (isSubset(arr1, arr2, p, q)) 
	        {
	            System.out.print("arr2[] is " + "subset of arr1[] ");
	        }
	        else 
	        {
	            System.out.print("arr2[] is " + "not a subset of arr1[]");                        
	        }
    }
}