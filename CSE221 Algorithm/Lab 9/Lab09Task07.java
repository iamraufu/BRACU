public class Lab09Task07{
  public static void main (String[]args){
    int[] a={1, 2, 3, 4, 5, 6};
    LinkedList list=new LinkedList(a);
    
    reverse(list.head);
  }
  
  static void reverse(Node h){
    if(h.next!=null){
      reverse(h.next);
      System.out.println(h.element);
    }
  }
}