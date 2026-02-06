package ArrayDsa;
     import java.util.*;
public class Secondlargest {
    public static int findSecondlargest(int arr[],int n)
    {
    	int max1=Integer.MIN_VALUE;
    	int max2=Integer.MIN_VALUE;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]>max1)
    		{
    			max1=arr[i];
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]>max2 && arr[i]!=max1)
    		{
    			max2=arr[i];
    		}
    	}
    	return max2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter the size of array :");
      int n=sc.nextInt();
      
      int []arr=new int [n];
      
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      int result=findSecondlargest(arr,n);
      System.out.println(result);
	}

}
