package dsa.recursion;
import java.util.*;


public class AlternateSum 
{
    public static int AlternateSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n%2==0)
        {
            return AlternateSum(n-1)-n;
        }
        else
        {
            return AlternateSum(n-1)+n;        
        }
}
    public static void main(String[]args)
    {
        // ready system to take input 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int result=AlternateSum(n);
        System.out.println("Alternate Sum Series is : " + result);



    }
}
