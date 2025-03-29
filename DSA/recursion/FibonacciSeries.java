package dsa.recursion;
import java.util.*;

public class FibonacciSeries 
{
    public static int FindFibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return FindFibonacci(n-1)+FindFibonacci(n-2);

        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find Fibonacci: ");
        int n=sc.nextInt();

        // defining function
        int result=FindFibonacci(n);
        System.out.println("Fibonacci series is: "+ result);
        
    }
    
}
