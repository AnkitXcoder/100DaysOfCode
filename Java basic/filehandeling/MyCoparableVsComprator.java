package filehandeling;
import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;

// use comparable (implementing) where class of object are accesable ( by implementing and compareTo)
// use comprator where class is not accesable or able to modifie the class

class Student implements  Comparable<Student> // implimenting compable directly in class 2nd methos ( compare methos is inbuilt in it)

{
    // variables

    int marks;
    int age;
    String name;

    // initialising variable
    public Student(int marks, int age, String name)
    {
        this.marks=marks;
        this.age=age;
        this.name=name;
    }

    // get the values of variable by method

    public int getMarks()
    {
        return marks;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
         return name;
    }

    // to print real vale instead of adress of data
    public String toString()
    {
        return "" + marks + "- " +name;
    }
//2nd approch ----> comprable implimenting diretly in class
    // if implimenting comprable method then have to tell on what basis
     public int compareTo(Student a)
     {
        if(this.age> a.age)
        return 1;
        else
        return -1;
     }
}

// class for comprator interface to define which data have to sort using collections

// to use lamda impliment comment below these
// class Alpha implements Comparator<Student>
// {
//     public int compare(Student a, Student b)  // compare method // here only one interface so we can also use lamda expression here 
//     {
//         if(a.marks>b.marks)
//         return 1;
//         else 
//         return -1;
//     }
// }



public class MyCoparableVsComprator {
    public static void main(String[] args) {
        
        Student st1=new Student(45,16,"ankit");
        Student st2=new Student(10,20,"ankita");
        Student st3=new Student(60,2,"amat");

        List<Student> list=new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
         
        System.out.println(list);

        // sorting can done with Collection because mix type data is here

        // Collection.sort(list);  compiler error --> on which data basis sorting done

        //Solve issue by comprator interface (inbuilt),, by making class and define there which data have to sort first 

       // Alpha a=new Alpha();
        //Collections.sort(list, a);
        //System.out.println(list);

    // implementng lamda 

    // Comparator<Student> com=(Student a, Student b)->
    // {
    //     if(a.marks> b.marks)
    //     return 1;
    //     else 
    //     return -1;
    // };
    // Collections.sort(list,com);
    // System.out.println(list);

    // now using 2nd method comprable 
    Collections.sort(list);
    System.out.println(list);


    







    }
}
