//For file  remb..  filename.exists() ,,,, filename.createNewFile();
// For folder .mkdir
//handel the exception 

package filehandeling;
import java.io.*;

public class CreateFileDir {

    public static void main(String[] args) throws IOException

    {
        

        File file1=new File("Createfile.txt");
    System.out.println(file1.exists());    // false bcz there is no file of this name

    file1.createNewFile();// throw IO Exception that means compiler told to handel the error here ,, but i throw exception above 
    System.out.println(file1);  // file craeted in folder where main code folder 

//directory craetion

    File dir=new File("Creade");
    System.out.println(dir.exists());  // false

    dir.mkdir();
    System.out.println(dir.exists());

    
    }
}

//OUTPUT 
// true
// Createfile.txt
// true
// true