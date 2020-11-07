public class Task7
{
  public static void main(String [] args)
  {
    Node head=new Node(10,null);
    Node tail=head;
    for(int c=20; c<=100; c+=10)
    {
      tail.next=new Node(c,null);
      tail=tail.next;
    } 
    System.out.println("Printing all elements sequentially:");
    for(tail=head; tail!=null; tail=tail.next)
    {
      System.out.print(tail.element+" ");
    }
    System.out.println();
    System.out.println("Printing all elements in reverse order:");
    Reverse(head);
  }
  public static void Reverse(Node h)
  {
    if(h.next!=null)
    {
      Reverse(h.next);
      System.out.print(h.element+" ");
    }
    else
    {
      System.out.print(h.element+" ");
    }
  }
}