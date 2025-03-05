// collection using ArrayList

package mycollection;
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300); //information stored as a object
        al1.add(500);
        al1.add(500); // can repeate data
        al1.add("ankit"); //mix type information ,,int and string


        System.out.println(al1);
       ArrayList al2=new ArrayList();
       al2.add("ram");
       al2.addAll(al1);           // adding another collection to other collection
       al2.add(3,"Add at index 3");  //adding at index in ArrayList
    
    System.out.println(al2);
    
    }
}

//output
//[100, 200, 300, 500, 500, ankit]
//[ram, 100, 200, Add at index 3, 300, 500, 500, ankit]