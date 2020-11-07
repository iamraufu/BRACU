public class Node{
    
     public int value;
     public Node next;
     public Node prev;
      
     public Node(int v, Node n, Node p){
         
         value = v;
         next = n;
         prev = p;
     }
}