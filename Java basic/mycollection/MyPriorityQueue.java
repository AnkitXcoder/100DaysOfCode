//PriprityQueue arrange data in min heap data structure way
//no mixture of data type adding is allowed

package mycollection;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) 
    {
        PriorityQueue ad1=new PriorityQueue();

        //adding data
        ad1.add(100);
        ad1.add(50);
        ad1.add(150);
        ad1.add(25);
        ad1.add(75);
        ad1.add(175);

        System.out.println(ad1);
    
    }
}

//OUTPUT
//[25, 50, 150, 100, 75, 175]