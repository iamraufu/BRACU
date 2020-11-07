public class lab08task03{
  public static void main (String [] args){
    
    int[] arr = {50 , 52, 2, 69, 15, 6, 3};
    
    Node head = new Node(arr[0] ,null);
    Node tail = head;
    
    for(int i = 1 ; i<arr.length ; i++){
      Node temp = new Node (arr[i], null);
      tail.next = temp;
      tail = tail.next;
    }
    
    
    for(Node a = head ; a!=null ; a = a.next){
      for(Node b = head ; b.next!=null ; b = b.next){
        if((int)b.val>(int)b.next.val){
          Object t = b.val;
          b.val = b.next.val;
          b.next.val = t;
        }
      }
    }
    
    for(Node c = head ; c!=null ; c = c.next){
      System.out.println(c.val);
    }
    
  }
}
    
    
    
    