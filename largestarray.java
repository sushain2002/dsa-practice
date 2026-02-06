package ArrayDsa;

public class largestarray {
	public static int LargestArray(int []arr,int n)
	{
		 int largest=arr[0];
		   
		   for(int i=1;i<n;i++)
		   {
			   if(arr[i]>largest)
			   {
				   largest=arr[i];
			   }
		   }
           return largest;
	}
   public static void main(String [] args)
   {
	   int arr[]= {10,5,6,1,11,31};
	   int n=arr.length;
	  	   
	   int maxsol=LargestArray(arr,n);
	   System.out.println(maxsol);
   }
}
