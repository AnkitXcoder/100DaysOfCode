package filehandeling;
import java.io.*;

public class FileReaderr {
   public static void main(String[] args) throws Exception
   {
    
    File dir=new File("Java basic");
    File file=new File(dir,"filereader.txt");

    FileReader fr=new FileReader(file); //giving exception

    // now start reading
    int i=fr.read();
    //System.out.println((char) i); //only one char it reading here
    while(i!=-1)
   {
    System.out.print(i+ "--->"); //to print Asci value                         //3rd
    System.out.println((char) i); // print char i but infinite time loop runs    1st
    i=fr.read(); //to prevent from infinte loop,, read upto file data            2nd

   }

   }
}

//OUTPUT 
// Printing to view easily view of result in terminal
// 100--->d
// 106--->j
// 13--->
// 10--->

// 106--->j
// 13--->
// 10--->

// 106--->j
// 102--->f
// 104--->h
// 107--->k
// 106--->j
// 100--->d