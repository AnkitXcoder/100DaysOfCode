package sorting;

//time complexity: O(n^2)
//space complexity: O(1)

import java.util.Arrays;
import java.util.*;
public class selectionSort {
    //defining the function
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
          //min_index is taking the index of minimum element
          int min_index=i;
          for(int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;

            }
          }
          //kya min_index ki value i ke equal hai
          if(min_index!=i){
            // ydi min_index ki value i ke equal nhi hai ,th need swap
            //swap min_index and arr[i]
            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
          } 
        }
    }
    public static void main(String[]args){
        int arr[]={20,50,12,17,19,90,25,7};
        //calling function
        selectionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
