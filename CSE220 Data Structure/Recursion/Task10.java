public class Task10
{
  public static void main(String [] args)
  {
    Node head=new Node(50,null);
    Node tail=head;
    tail.next=new Node(30,null);
    tail=tail.next;
    tail.next=new Node(10,null);
    tail=tail.next;
    tail.next=new Node(40,null);
    tail=tail.next;
    tail.next=new Node(20,null);
    System.out.println("All elements of linked list:");
    for(tail=head; tail!=null; tail=tail.next)
    {
      System.out.print(tail.element+" ");
    }
    System.out.println();
    SelectionSortList(head);
    System.out.println("Sorted elements of linked list:");
    for(tail=head; tail!=null; tail=tail.next)
    {
      System.out.print(tail.element+" ");
    }
  }
  public static void SelectionSortList(Node h)
  {
    if(h.next.next!=null)
    {
      Node m=min(h.next);
      if(h.element>m.element)
      {
        int temp=h.element;
        h.element=m.element;
        m.element=temp;
      }
      SelectionSortList(h.next);
    }
  }
  public static Node min(Node h)
  {
    if(h.next==null)
    {
      return h;
    }
    Node m=min(h.next);
    if(m.element>h.element)
    {
      return h;
    }
    return m;
  }
}