import java.util.*;
class Task6{
  public class Node{
  public int val;
  public Node next;
  public Node(int v){
  val=v;
  next=null;
  }
  }
  Node head;
  int length=0;
public  void Add(Node head,int a) {
 if (this.head == null) {
     this.head = new Node(a,null);
  } else {
     add(this.head, a);
  }
  length++;
  return this;
}
public void printAll(){
  for(Node temp=head;temp!=null;temp=temp.next){
  System.out.print(temp.val);
  }
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int x[]={45,12,8,4,34,9,1234};
Task6 a=new Task6();
for(int i=0;i<x.length;++i){
a.Add(x[i]);
}
a.printAll();
}
}