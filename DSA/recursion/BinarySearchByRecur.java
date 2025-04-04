package dsa.recursion;
import java.util.*;

public class BinarySearchByRecur 
{
    public static int BinarySearch(int n,int beg,int end,int arr[])
    {
        int result = -1;  //no element present in arr
        while(beg<=end)
        {
            int mid= beg+(end-beg)/2;

            if (arr[mid]==n)
            {
                return mid;
            }
            else if(arr[mid]<n)
            {
                //traverse towrd right side of array
                return BinarySearch(n, mid+1, end, arr);
            }
            else
            {
                //traverse left side of array
                return BinarySearch(n, beg, mid-1, arr);
            }


        }
        return result;
       

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(2,3,4,5,6,7,8,9,22,33,44,55,77) to know Position :");
        int n=sc.nextInt();
      
        

      int arr[]={2,3,4,5,6,7,8,9,22,33,44,55,77};
      int beg=0;
      int end=arr.length-1;
    //   int n=22;
      //function call
      int result=BinarySearch(n,beg,end,arr);
      System.out.println("Enered number is at position :"+result);

        
    }
    
}
