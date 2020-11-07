public class Lab09Task06{
  public static void main (String [] args){
    int[] array = {1, 2, 3};
    
    LinkedList list = new LinkedList(array);
    
    System.out.println(add(list.head));
    
  }
  
  static int add (Node n){
    if (n == null){
      return 0;
    }
    else{
      return n.element + add(n.next);
    }
  
  }
  
}