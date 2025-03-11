package filehandeling;
import java.util.*;
// Collections --> dont foget s 

public class MyCollections {
    
    public static void main(String[] args) {
        
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(50);
        al.add(60);
        al.add(100);

        Collections.sort(al);    // sorted the arraylist
        System.out.println(al);

    // Sorting the string type 
       
       ArrayList<String> al1=new ArrayList<String>();
       al1.add("ANkit");
       al1.add("Ram Ji");
       al1.add("Albert");

       Collections.sort(al1);
       System.out.println(al1);  // String Sorted

    // Binary Search  ---> but in index value store, index print
    
       ArrayList al3=new ArrayList();
        al3.add(10);
        al3.add(50);
        al3.add(60);
        al3.add(100);
        al3.add(500);

        int index=Collections.binarySearch(al3, 50);
        System.out.println("Searched Index is : "+index);
 
    // Rotate the data
        ArrayList al4=new ArrayList();
        al4.add(10);
        al4.add(50);
        al4.add(60);
        al4.add(100);
        al4.add(500);

        Collections.rotate(al4, 2);  // 2 is index here 
        System.out.println(al4);

    // Shiffle the List 

        ArrayList al5=new ArrayList();
        al5.add(10);
        al5.add(50);
        al5.add(60);
        al5.add(100);
        al5.add(500);

       // Collections.shuffle(al5);
        //System.out.println(al5);

    // frequency of any number ---> how many times appeared is 
     
        Collections.frequency(al5,50);
        System.out.println("frequency is : " +Collections.frequency(al5, 50));
       
    }
    
}

// [10, 50, 60, 100]
// [ANkit, Albert, Ram Ji]
// Searched Index is : 1
// [100, 500, 10, 50, 60]
// frequency is : 1