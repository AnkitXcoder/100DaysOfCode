package mymap;
import java.util.*;

public class MyHashTable {
    public static void main(String[] args) {
 //Hashtable       
        Hashtable ht=new Hashtable();
        ht.put(2,"Ankit");
        ht.put(4,"Kalki");  //order of insertion not preserve
        ht.put(1,"ram");

       // ht.put(null,"Ankit"); null Pointer exception
       // ht.put(null,null);    null not allowed

        System.out.println(ht);
//tree map
        TreeMap tm=new TreeMap();  //output is in sorted order
                                   // insertion order not preserve
                                
        tm.put(2,"salema haha");
        tm.put(5,"Lovies");    //oredr of insertion not preserve
        tm.put(1,"ankit"); 

        System.out.println(tm);

    }
}
