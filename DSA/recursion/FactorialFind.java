package dsa.recursion;
import java.util.Scanner;

public class FactorialFind 
{


    public static int findfactorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*findfactorial(n-1);
        }
    }


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int result=findfactorial(n);
        System.out.println("factorial is: "+ result);

        
    }
    
}
