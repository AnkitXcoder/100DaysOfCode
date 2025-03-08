// 

package mymap;
import java.util.*;

public class MyHashMap {
    public static void main(String[] args)
    {
        HashMap hs=new HashMap();  //insertion Order not Preserve

        hs.put(00,"Ankit");  // as a Entry
        hs.put(01,"Ankita");
        hs.put(02,"Ankita");  // can same value but with diff.. Key
    
        hs.put(null,null); // Null Key Value Allowed
        hs.put(null,"null1");  //Print only one Key value

        System.out.println(hs);

        LinkedHashMap Lhm=new LinkedHashMap();    //insertion Order preserve

        Lhm.put(00,"ankit");
        Lhm.put(01,"Ankita");
        Lhm.put(02,"Ankita1");

        System.out.println(Lhm);

    }
}
