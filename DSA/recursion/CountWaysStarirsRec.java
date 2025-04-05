package dsa.recursion;
import java.util.*;


public class CountWaysStarirsRec 
{
    // defining function
    public static int countStairs(int n)
    {
        int result=0;
        //bse case condition
        if(n<=1)
        {
            return n;
        }
        else{
            result=countStairs(n-1) + countStairs(n-2); //fibonacci sries 
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Stairs ");
        int n=sc.nextInt();

        //fuction calling
        int result=countStairs(n+1); // n+1 bcz n user input th ways hoga fib of n+1 see notes 
        System.out.println("Number of ways is :"+result);

    }
    
}
