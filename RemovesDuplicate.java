package ArrayDsa;
import java.util.*;
public class RemovesDuplicate {
        public static int removeDuplicates(int arr[],int n)
        {
        	 int i=0;
        	 for(int j=0;j<n;j++)
        	 {
        		 if(arr[i]!=arr[j])
        		 {
        			 i++;
        			 arr[i]=arr[j];
        		 }
        	 }
        	 return i+1;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=sc.nextInt();
      
      int arr[]=new int [n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      int result=removeDuplicates(arr,n);
      System.out.println(result);
	}

}
