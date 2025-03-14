package filehandeling;
import java.io.*;

public class FileCounting {
    public static void main(String[] args) {

// checking folder exist
        File dir=new File("filecou");
        System.out.println(dir.isDirectory());
        
//create new folder -> directory

        dir.mkdir();
        System.out.println(dir.isDirectory());
        
// counting file inside folder/dorectory
      
        int count = 0;

        File f=new File("filecou"); // in this folder how much file are
       

        String str[]=f.list();
        

        for(String name: str)
        {
                count++;
                System.out.println(name);

        }

        System.out.println("No of files are "+count);

    }
}
