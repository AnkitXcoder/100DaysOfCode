package genericcs;
import java.util.*;


// now making khud ka generics which take Type T
class Gen<T>
{
    private T obj;
    
    public Gen(T obj)
    {
        this.obj=obj;
    }

    void disp()
    {
        System.out.println("the Type of data is : "+obj.getClass().getName());
    }
    public T getObj()
    {
        return obj;
    }
}
public class MoreOnGenerics {
 
    public static void main(String[] args) {
        
        // ArrayList<Integer> List1=new ArrayList<Integer>();
        // List<String> List2=new ArrayList<String>();
        // Collection<Integer> List3=new ArrayList<Integer>();

       // List<Object> List4=new ArrayList<String>();  // NHI chlega   ----> compile time error

       Gen<Integer> g=new Gen<>(10);

       g.disp();
       System.out.println(g.getObj());

       System.out.println("******************");

       
       Gen<String> g1=new Gen<String>("Ankit");
       g1.disp();
       System.out.println(g1.getObj());
        



    }

}
