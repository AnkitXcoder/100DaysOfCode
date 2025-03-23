package filehandeling;
import java.io.*;

public class BufferedReaad 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Java basic");

        //file object 
        File file=new File(dir,"filereader.txt");

        //filereader
        FileReader fr=new FileReader(file);
        //BufferedRead
        BufferedReader br=new BufferedReader(fr);

        //raed by line 
        String line=br.readLine();  //String line=  ----> to store the read in string 

        //jbtk line hai tbtk raed
        while(line!=null)
        {
            System.out.println();
            System.out.println(line);
            // not read operation repeate the line
            line=br.readLine();

        }
        

        br.close();
        


        
    }
    
}
