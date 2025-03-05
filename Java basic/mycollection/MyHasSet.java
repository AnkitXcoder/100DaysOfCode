// Used in Fast and efficent Searching
// Use bucket store Behind the scene
// hashset use Hash Algorithm (Bucket)
// LinkedhashSet-- use to Preserve the Order of data insertion

package mycollection;
import java.util.*;
public class MyHasSet {
    public static void main(String[] args) {
     
 // doesnot preserve order of data insertion in Output       
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);   
//Preserve oredr of Insertion of data in array
        LinkedHashSet hs1=new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);

        System.out.println(hs1);
    }

}

//OUTPUT
// [100, 20, 40, 30] HashSet
// [100, 20, 30, 40] LinkedHashSet