import java.util.Scanner;


class Node{
    int data;
    Node next = null;

    public Node(int num)
    {
        data = num;
 
    }
}

class LinkedList{

    Node head = null;
    public void InsertNodeFirst(int no)
    {
        Node newNode = new Node(no);

        if( head == null)
        {
            head = newNode;
        }
        else{
            Node temp = head; // will poit to head
            head = newNode;
            head.next = temp;
           
        }
        
    } 
    public void InsertNodeLast(int no)
    {
        Node newNode = new Node(no);
        Node temp = head;
        if(head == null)
        {
            head = newNode;
        }
        else{
            
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }
    
    public void InsertNodePos(int no, int pos)
    {
        Node newNode = new Node(no);
        Node temp = head;
        int size = Count();
        if(pos <  1 || pos > size + 1)
        {
            return;
        }
        if(pos == 1)
        {
            InsertNodeFirst(no);
        }
        else if(pos == size+1)
        {
            InsertNodeLast(no);
        }
        else{
            for(int i = 1; i< pos-1; i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }

    }

    public void DeleteNodeFirst()
    {
       
        if(head == null)
        {
            return;
        }
        else 
        {
            if(head != null){
            head = head.next;

            }
            else
            {
                head = null;
            }
        }
    }

    public void DeleteNodeLast()
    {

        Node temp  = head;
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            while(temp.next.next != null)
            {
                temp = temp.next;

            }
            temp.next = null;
        }
    }

    public void DeleteNodePos(int pos)
    {
        Node temp  = head;
        int size = 0;
        size = Count();
        if(pos < 1 || pos > size)
        {
            return;
        }
        if(pos == 1)
        {
            DeleteNodeFirst();
        }
        else if(pos == size)
        {
            DeleteNodeLast();
        }
        else
        {
            for(int i = 1; i < pos-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
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

    
public class SinglyLinkedList {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);

        Node first = null;

        LinkedList list = new LinkedList();
        
        list.InsertNodeFirst(1);
        list.InsertNodeFirst(6);
        list.InsertNodeFirst(2);
        list.InsertNodeFirst(3);
        list.Display();

        list.InsertNodeLast(4);
        list.InsertNodeLast(7);
        list.InsertNodeLast(9);
        list.Display();
        // deleteNode(first);
        System.out.println("Enter position to insert:");
        int pos = sc.nextInt();
        list.InsertNodePos(5,pos);
        list.Display();

        int bret = list.Count();

        list.DeleteNodeFirst();
        list.Display();

        list.DeleteNodeLast();
        list.Display();

        list.DeleteNodePos(pos);
        list.Display();

    }
}
