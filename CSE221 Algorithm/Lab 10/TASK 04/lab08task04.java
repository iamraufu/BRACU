public class lab08task04{
  public static void main (String[]args){
    int [] arr = {25, 12, 2, -8, 65, 42, 10};
    
    Node head = new Node (arr[0],null);
    Node tail = head;
    
    for(int i = 1 ; i<arr.length ; i++){
      Node temp = new Node (arr[i] , null);
      tail.next = temp;
      tail = tail.next;
    }
       
    for(Node a = head ; a.next!=null ; a=a.next){
      Node minIndex = a;
      for(Node b = a.next ; b!=null ; b=b.next){
        if((int)b.val<(int)minIndex.val){
        minIndex = b;
        }
      }
      Object temp = minIndex.val;
      minIndex.val = a.val;
      a.val = temp;
    }
    
    for(Node c = head ; c!=null ;c=c.next){
      System.out.println(c.val);
    }
  }
}