public class LinkedList{
  public Node head;

  public LinkedList(int [] a){
    head = new Node(a[0],null);
    Node tail = head;
    for (int i = 1 ; i<a.length ; i++){
      Node x = new Node (a[i] , null);
      tail.next = x;
      tail = tail.next;
    }
  }
  
  public LinkedList(Node h){
    head = h;
  }
  
   public Node reverseList(){
    Node reverseNode = new Node (head.element , null);
    
    for(Node n = head.next ; n!=null ; n = n.next){
      Node  x = new Node (n.element , reverseNode);
      reverseNode = x;
    }
    
    return reverseNode; // please remove this line!
  }
  
  
}