//array traverse in Inorder traversal
// no dublicate value allow to print
// no value insert
// ceiling and floor value me ydi data present th same value dega wrna ceiling and lower value dega

package mycollection;
import java.util.*;

public class MyTreeSet {
    public static void main(String[] args) 
    {
        TreeSet ts=new TreeSet();

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(175);
        ts.add(175); //dublicate not allowed

        System.out.println(ts);  // result is in Inorder Traversal
        
        //method of Treeset applied on data

        System.err.println(ts.higher(50));
        System.out.println(ts.lower(50));

        // 40 is not present hence ceiling floor value dega
        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));
        // 50 hmare collection me hai th same value 50 dega 
        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
    }
}


//OUTPUT
//[25, 50, 75, 100, 150, 175]
// 75
// 25
// 50
// 25
// 50
// 50