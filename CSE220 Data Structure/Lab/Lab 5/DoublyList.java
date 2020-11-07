public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    
    return -100; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for(Node a=head.next;a!=head;a=a.next){
      System.out.print(a.element+" ");
    }
    System.out.println();
  }
  
  public void backwardprint(){
    for(Node a=head.prev;a!=head;a=a.prev){
      System.out.print(a.element+",");
    } 
    System.out.println();
    
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int count=0;
    for(Node a=head.next;a!=head;a=a.next){
      if(count==idx){
        return a;
      }
      count++;
    }
    return null;
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count=0;
    for(Node a=head.next;a!=head;a=a.next){
      if(a.element==elem){
        return count;
      }
      count++;
    }
    return -1;
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node n=new Node(elem,null,null);
    int count=0;
    for(Node a=head.next;a!=head;a=a.next){
      if(count==idx){
        n.next=a;
        n.prev=a.prev;
        (a.prev).next=n;
        a.prev=n;
      }
      count++;
    }
    if(count==idx){
      n.prev=head.prev;
      head.prev.next=n;
      head.prev=n;
      n.next=head;
    } 
  }
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int count=0;
    Object n=null;
    for(Node a=head.next;a!=head;a=a.next){
      if(count==index){
         n=a.element;
        (a.prev).next=a.next;
        (a.next).prev=a.prev;
      }
      count++;
    } 
    return n; // please remove this line!
  }
  
  
  
}