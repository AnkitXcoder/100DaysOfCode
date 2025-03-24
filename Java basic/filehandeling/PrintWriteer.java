package filehandeling;
import java.io.*;


public class PrintWriteer 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Java basic");
        File file=new File(dir,"filereader.txt");

        // fileWriter
        FileWriter fr=new FileWriter(file);
        // PrintWriter 
        PrintWriter pw=new PrintWriter(fr);

        //writer to file --> in same line
        pw.print("Akit");   //char type ---> printed no error
        pw.print(100);      // int type ---> printed no ASCI value print
        pw.print(true);   // boolean type ---> printed boolean type data ,, no error

        // to print in next line 
        pw.println("nyaline");
        pw.println(1000);
        pw.println(false);

        pw.close();   // close will close FileWriter ALong with PrintWriter
 
    }
    
}


//OUTPUT
// Akit100truenyaline
// 1000
// false
