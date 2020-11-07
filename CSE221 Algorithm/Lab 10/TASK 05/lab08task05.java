public class lab08task05{
  public static void main (String[]args){
    
    int[] arr = {52, 45, 2 ,0, -8 , 36, 28,20};
    Node head = new Node (arr[0] , null , null);
    Node tail = head;
    
    for(int i = 1 ; i<arr.length ; i++){
      Node temp = new Node (arr[i] , null , null);
      tail.next = temp;
      temp.prev = tail;
      tail = tail.next;
    }
    
    for(Node i = head ; i!=null ; i = i.next){
      Object temp = i.element;
      
      Node j = i;
      
      while(j.prev!=null && (int) j.prev.element> (int)temp){
        j.element = j.prev.element;
        j = j.prev;
      }
      j.element = temp;
    }
    
    for(Node b = head ; b!=null ; b = b.next){
      System.out.println(b.element);
    }
    
  }
}