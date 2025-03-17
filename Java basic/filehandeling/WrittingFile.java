//writting on file 
// mkdir  create folder,,
//mkdrs create folder if not present
package filehandeling;
import java.io.*;

public class WrittingFile {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

        
        // craeting file in folder where code open

       File dir = new File("C:\\code\\Java\\filehandeling");

       if(!dir.exists())
       {
        dir.mkdir();
        System.out.println("Directory craeted "+ dir.getAbsolutePath());

       }
       else
       {
        System.out.println("directory already exist " + dir.getAbsolutePath());
       }




        File file=new File(dir,"writtingfile.txt");
        if(!file.exists())
        {
            if(file.createNewFile())
            {
                System.out.println("File craeted succesfull");
            }
            else
            {
                System.out.println("Failed to craete a file");
            }
        }
        else
        {
            System.out.println("file alraedy exist ");
        }
       

        //now writing in file (fc) true beacuse want no data overrides ,, i.e want everydata we erite here
        FileWriter fw1=new FileWriter(file , true);

        fw1.write("Ankit");
        fw1.write(65);
        fw1.write("mcdost");
         
        fw1.close();
        System.out.println("the answer is");


    }
    
}
