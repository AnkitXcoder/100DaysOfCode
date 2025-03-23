package filehandeling;
import java.io.*;

public class BufferWritee 
{
    public static void main(String[] args) throws Exception
    {
        // directory object
        File dir=new File("Java basic");

        //File object
        File file=new File(dir, "filereader.txt");

        //Filewritter object to write data in file
        FileWriter fr=new FileWriter(file, true); //passing file here ---> true to write so many times

        // supproting Filewrite by Buffered Write 
        BufferedWriter br=new BufferedWriter(fr);

        //writing in Buffered write 
        br.write("Ankit");
        br.newLine();
        br.write(55);
        br.newLine();
        char ch[]={'a','b','h','t'};
        br.write(ch);

        br.flush();
        br.close(); // same as flush --> closeing buffered writer --> internaly close filewriter 

        
    }
    
}
