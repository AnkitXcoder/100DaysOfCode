package api;
import java.util.*;
import java.util.function.Consumer;
 


public class ForeachLoop 
{
    public static void main(String[] args)
    {
        // List<Integer> list1=new ArrayList<Integer>();
        // list1.add(2);
        // list1.add(4);
        // list1.add(8);
        // list1.add(9);
        // System.out.println(list1);

        //making collection by inbult method

        List<Integer> list2=Arrays.asList(2,4,8,9);  // arrays not array
        System.out.println(list2);


//-------------------------------way to process data --------------------
        // for(Object o:list2)
        // for(Integer i:list2)
        // {
        //     System.out.println(i);
        // }
//--------------------------------- for loop ended -------------------------
        //in java 8 using inbult method acces list without loop
// -------------------------------- for each using lemda and consumer interface ------

// 1st method      list2.forEach(n->System.out.println(n));    --> lamda expression  

// 2nd method 
    //anynomous innr class using Consumer interface
    //     Consumer<Integer> cons=new Consumer<Integer>()
    //     {
    //         @Override
    //         public void accept(Integer i)
    //         {
    //             System.out.println(i);
    //         }
    //     };

       

    //    list2.forEach(cons);   // using for loop inbult for data iteration
                              // so have to make a consumer class and pass cons in for aech loop

// 3rd method 
    //    Consumer<Integer> cons=i-> System.out.println(i);

    //    list2.forEach(cons);


//best approach

     list2.forEach(n->System.out.println(n));       // --> lamda expression

        
    }
    
}
