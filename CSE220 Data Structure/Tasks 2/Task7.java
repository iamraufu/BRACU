import java.util.Scanner;
public class Recursion7{
   public static void main(String[]args){
    Node a=new Node(10,null);
    Node b=new Node(20,null);
    Node c=new Node(30,null);
    Node d=new Node(40,null);
    Node e=new Node(50,null);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
   printAll(a);
  }
 
  public static void printAll(Node head){
    if(head==null)return;
    //System.out.println(head.val); //For printing forward
    printAll(head.next); 
    System.out.println(head.val);
    
    
  }
  
}