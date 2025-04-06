package dsa.linkedlist;

public class AddNodeAtEnd 
{
    //creating node class
    Node head; //initiliasing node
    class Node
    {
        int data;
        Node next; // next pointer

        //defining constructor --> data user dala th kha jayega defining here
        Node(int d)
        { // d is any data here --> by user 
        data = d;  // d yha data me store hua 
        next=null;
        }  //next pointer me address null initilise hua 
    }
    // implementing of Insertion of Node at the ebd
    // defining function --> and take user newData in fun..
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);

        // check LL is empty or not
        if (head==null)
        {
            head= new Node(newData); // head ke andr jo value hai new node ki usse define kr rhy hai
            return; // from there no further work need to do
        }

        //lL is not empty 
        newNode.next =null;
        Node temp = head; // pointer leya aur initialise kiya head se
        while(temp.next!=null)
        {
            temp=temp.next; //updating temp
        }

        temp.next = newNode; // newNode ka adress jo hai temp me assign ho jayega
        return;

    }

    //implementation of displaying the LL
    // by making function we display
    public void displayLL()
    {
        Node current= head;
        while(current!= null)
        {
            System.out.println(current.data+ ""); // printing temp data
            current =current.next;  // updating temp
        }
    }


    public static void main(String[] args)
    {
        AddNodeAtEnd list=new AddNodeAtEnd();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);

        System.out.println("Before Insertion of 10");
        list.displayLL();  // display 
        System.out.println();

        list.insertAtEnd(10);
        System.out.println("After Insertion of 10");
        list.displayLL();  // display 
        System.out.println();
        
    }
    
}
