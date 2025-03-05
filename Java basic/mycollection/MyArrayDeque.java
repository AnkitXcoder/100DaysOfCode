//ArrayDeque used to store data at rare and front
//used .offer and .add to add data 

package mycollection;
import java.util.*;

public class MyArrayDeque {
    public static void main(String[] args)
    {
        ArrayDeque al1=new ArrayDeque();
        
        al1.add(100);
        al1.add(200); //add info/data

        al1.add("ankit"); //adding string

        al1.offer(3002);  //adding data using offer
        al1.offerFirst(500); //adding data at front using offerFirst
        al1.offerLast("last"); //ading data at last


        System.out.println(al1);
    }

}
//output
// [500, 100, 200, ankit, 3002, last]