package ArrayDsa;
import java.util.*;
public class MissingNumber {
          public static int MissingNum(int arr[],int n)
          {
        	  int actual_sum=0;
        	  int expected_sum=n*(n+1)/2;
        	  for(int i=0;i<n;i++)
        	  {
        		  actual_sum+=arr[i];
        	  }
        	  return expected_sum-actual_sum;
          }
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the size of array :");
     int n=sc.nextInt();
     
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     
     int result=MissingNum(arr,n);
     System.out.println(result);
	}

}
