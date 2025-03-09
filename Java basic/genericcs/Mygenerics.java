package genericcs;
import java.util.*;

class Student1
{
    private String name;
    private int id;

}
class Empolyee
{
    private String name;
    private int id;

}
public class Mygenerics {
    public static void main(String[] args) {

        // String arr[]=new String[5];   //typesafety by taking only string data
        //   arr[0]="ankit";
        //   arr[1]="Ramayana";

        // //arr[2]=10; // compile time error

        // ArrayList al=new ArrayList();  // no typesafety
        //   al.add("Ankit");
        //   al.add("babu raw");

        //   al.add(10);
        //   al.add(20);  // no error,, hence no typesafety,---> can add any type of data

        // // Generics ----> Type Safety Achieved

        // ArrayList<String> al1=new ArrayList<String>();
        // al1.add("Ankit");

        // al1.add(10); // compile time error 

 Student1 st=new Student1();
 Empolyee ee=new Empolyee();
  
  ArrayList<Student1> al2=new ArrayList<Student1>();
   
   al2.add(st);
   // al2.add(ee);  //after generics --> tyoesafety acheived
// upto here we want to work on student data type and if someone add emloyee data so no error it work
// but we want type casting to rtrive the data ,, so there will be run time error for employee type data
// to safe from this use generics
System.out.println(al2);
    }
}
