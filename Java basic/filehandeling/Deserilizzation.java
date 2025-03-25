package filehandeling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;



class Vlogger implements Serializable
{
    private String name;
    private String subscriber;
    private int age;

    public Vlogger(String name,String subscriber,int age)
    {
        this.name=name;
        this.subscriber=subscriber;
        this.age=age;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(subscriber);
        System.out.println(age);

    }
}
public class Deserilizzation 
{ 
    public static void main(String [] args) throws Exception
    {
    // no object i have to make 
    // use file object here to get data
    // reading Object from file
    FileInputStream fis=new FileInputStream("filereader.ser");
    BufferedInputStream bis=new BufferedInputStream(fis);
    ObjectInputStream ois=new ObjectInputStream(bis);
System.out.println("Ankit");
// Downcasting to vloger to get vlogger and avoid parrent type object
    Vlogger v=(Vlogger)ois.readObject();
    v.disp();
    
    ois.close();  // closing resources




}

}
