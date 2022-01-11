import java.util.Scanner;

class Node{
    int data;
    Node prev = null;
    Node next = null;

    public Node(int num)
    {
        data = num;
 
    }
}

class LinkedList
{
    Node head = null;

    public void InsertNodeFirst(int no)
    {

        Node newNode = new Node(no);
        if( head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void InsertNodeLast(int no)
    {

        Node newNode = new Node(no);
        Node temp = head;
        if( head == null)
        {
            head = newNode;
        }
        else{

            while(temp.next != null)
            {
                temp = temp.next;
                
            }
                temp.next = newNode;
                newNode.prev = temp;        
        }
    }

    public void InsertNodePos(int no, int pos)
    {
        Node newNode = new Node(no);
        Node temp = head;
        int size = Count();
        if(pos < 1 || pos > size + 1)
        {
            return;
        }
        if(pos == 1)
        {
            InsertNodeFirst(no);
        }
        else if(pos == size + 1)
        {
            InsertNodeLast(no);
        }
        else
        {
            for(int i = 1; i < pos -1; i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            
            newNode.prev = temp;
            
        }
       
    }
    public int Count()
    {
        Node temp = head;
        int icont = 0;
        while(temp != null)
        {
            icont++;
            temp = temp.next;
        }

        System.out.println("Count:"+icont);
        return icont;
    }

    public void Display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + "\t");
            current = current.next;
        }
        System.out.println(); 
    }

}

public class DoublyLinkedList {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);

        Node first = null;

        LinkedList list = new LinkedList();

        // System.out.println("Enter number:");
        // int num = sc.nextInt();
        list.InsertNodeFirst(1);
        list.InsertNodeFirst(3);
        list.InsertNodeFirst(5);
        list.Display();
        int bret = list.Count();
        
        list.InsertNodeLast(6);
        list.Display();
        list.InsertNodeLast(7);
        list.Display();
        list.InsertNodeLast(8);
        list.Display();

        System.out.println("Enter position:");
        int pos = sc.nextInt();
        list.InsertNodePos(9, pos);
        list.Display();

    }
}
