package mycollection;
import java.util.*;

public class MyIterator {
    public static void main(String []args)
    {
     
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(10);
        al.add(20);
        al.add(30);
       System.out.println(al);
        
        //For Loop -- To Fetch Data
        // for(int i=0;i<al.size();i++)
        // {
          //  al.get(i); //fetching by index
        //    Object O=al.get(i);
        //    System.out.println(O);
           // System.out.println(al.get(i));
           // fetching by making object
           
    //     }

    //     // for each loop to fetch the data
    //     for(Object O:al)
    //     {
    //         System.out.println(O);
    //     }
    // }

// Iterator

           Iterator itr=al.iterator();
           while(itr.hasNext())  //use to the Data is available or not
           {
           // itr.next(); // ye object dega
         // Integer i=(Integer)itr.next();  //storing as integer 
         System.out.println(itr.next());
           }
   
    ListIterator litr=al.listIterator(al.size());
    while(litr.hasPrevious())
    {
      System.out.println(litr.previous());
    }
  }
}
