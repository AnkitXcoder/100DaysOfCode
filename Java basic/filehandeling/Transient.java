package filehandeling;

import java.io.BufferedOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


class fish implements Serializable
{
    //instance variable
    private String name;
    transient String part;
    private int teeth;

    //constructor
    public fish(String name, String part, int teeth)
    {
        this.name=name;
        this.part=part;
        this.teeth=teeth;

    }

    //display method
    public void disp()
    {
        System.out.println(name);
        System.out.println(part);
        System.out.println(teeth);    
    }


}

public class Transient 
{
    public static void main(String[] args) throws Exception
    {
//<-------------------------------------------------------------->
     // Serilization 

        // fish f=new fish("hosiyar","tail",24);
        // f.disp();

        // // for serializable use output 
        // FileOutputStream fos=new FileOutputStream("tranfish.ser");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);   // always use to enhance
        // ObjectOutputStream oos=new ObjectOutputStream(bos);

        // // write object data
        // oos.writeObject(f);
        // oos.flush();
        // oos.close();

//output 
// hosiyar
// tail ------->showing due to disp() there sysout part ,,,, its not participate in Serilizable
// 24
//<------------------------------------------------------------->
    // Deserilization

    // no object (fish) will made here
    // InputStream will use here
       //
       FileInputStream fos=new FileInputStream("tranfish.ser");
       BufferedInputStream bis=new BufferedInputStream(fos);      // always use to enhance
       ObjectInputStream ois=new ObjectInputStream(bis);

       //ois.readObject();
       //here need object for to get answer in object data not in parrent class
       fish f=(fish)ois.readObject();
       f.disp();
       ois.close();


// OUTPUT
//  hosiyar
//            null -------> transient so its null
// 24

      

    }
    
}
