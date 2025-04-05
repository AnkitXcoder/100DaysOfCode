package dsa.recursion;
import java.util.*;

public class PowerFindByRecu 
{
    public static long PowerFind(int a, int b)
    {
        int mid=0; long result=0; long finalResult=0;
        //base case condition
        if(b==1)
        {
            return a;
        }
        //Recursive case condition
        else
        {
            mid=b/2;
             result= PowerFind(a,mid);
             finalResult=result*result;  //if b is even
            if(b%2==0)
            {
                return finalResult;   //even exponent
            }
            else{
                return a*finalResult;  //odd exponnet so agin mult by a
            }


        }

    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nummber a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();

        long result=PowerFind(a,b);
        System.out.println("a^b= :"+result);
    }
}
