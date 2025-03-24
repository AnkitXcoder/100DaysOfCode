package filehandeling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Vlogger implements Serializable
{     
    // Declaring Instance variable

       private String name;
       private String subscriber;
       private int age;

       // Constructor 

       public Vlogger(String name,String subscriber,int age)
       {
            this.name=name;
            this.subscriber=subscriber;
            this.age=age;
       }
}
public class Serialisation 
{
    public static void main(String[] args) throws Exception
    {
        //making Data Object
        // Construct --> write only data ,, not write data with variable eg.. name:"AnkitXVlogs",
        Vlogger v=new Vlogger("AnkitXVlogs","One Million",20);  // value should be accr.. to constructor defined

        // fos
        FileOutputStream fos=new FileOutputStream("filereader.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
      
        // writing data
        oos.writeObject(v);
        oos.flush();
        oos.close();
        System.out.println("Object serialized and saved to 'filereader.txt'");

    }
    
}



