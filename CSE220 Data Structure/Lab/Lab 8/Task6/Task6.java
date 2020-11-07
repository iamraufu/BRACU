public class Task6{
  public static void main(String[]args){
    Node head=new Node(10,null);
    Node tail=head;
    for(int i=20;i<60;i+=10){
      Node n=new Node(i,null);
      tail.next=n;
      tail=n;
    }
    System.out.println(recursion(head));
  }
  public static int recursion(Node a){
    if(a.next!=null){
      return a.element+recursion(a.next);
    }
    else{
      return a.element;
    }
  }
}
      