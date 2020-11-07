public class Task7{
  public static void main(String[]args){
    Node head=new Node(10,null);
    Node tail=head;
    for(int i=20;i<50;i+=10){
      Node n=new Node(i,null);
      tail.next=n;
      tail=n;
    }
    recursion(head);
  }
  public static void recursion(Node a){
    if(a.next!=null){
      recursion(a.next);
      System.out.println(a.element);
    }
    else{
      System.out.println(a.element);
    }
  }
}