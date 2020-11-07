import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Node a=new Node(10,null);
    Node b=new Node(20,null);
    Node c=new Node(0,null);
    Node d=new Node(0,null);
    Node e=new Node(0,null);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    System.out.println(addAll(a));
  }
  public static int addAll(Node head){
    int sum;
    if(head.next==null) 
      return (int)head.val;
    sum=(int)head.val+addAll(head.next);
    return sum;
  }
    
  
  }