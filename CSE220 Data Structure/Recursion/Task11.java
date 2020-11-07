public class Task11
{
  public static void main(String []args)
  {
    DNode head=new DNode(50,null,null);
    DNode tail=head;
    tail.next=new DNode(30,null,tail);
    tail=tail.next;
    tail.next=new DNode(10,null,tail);
    tail=tail.next;
    tail.next=new DNode(40,null,tail);
    tail=tail.next;
    tail.next=new DNode(20,null,tail);
    System.out.println("All elements of linked list:");
    for(tail=head; tail!=null; tail=tail.next)
    {
      System.out.print(tail.element+" ");
    }
    System.out.println();
    Sort(head);
    System.out.println("Sorted elements of linked list:");
    for(tail=head; tail!=null; tail=tail.next)
    {
      System.out.print(tail.element+" ");
    }
  }
  
  public static void Sort(DNode h)
  {
    if(h!=null)
    {
      swap(h.prev, h.element);
      Sort(h.next);
    }
  }
  public static void swap(DNode h, int n)
  {
    if(h!=null)
    {
      if(h.element>n)
      {
        h.next.element = h.element;
        h.element = n;
      }
      swap(h.prev, h.element);
    }
  }
}
