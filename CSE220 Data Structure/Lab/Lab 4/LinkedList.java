public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=tail.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    for(Node a=head;a!=null;a=a.next){
      count++;
    }
    return count;// please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node a=head;a!=null;a=a.next){
      System.out.print(a.element+",");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int count=0;
    for(Node a=head;a!=null;a=a.next){
      if(count==idx){
        return a.next;
      }
      count++;
    }
    return null;// please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    int count=0;
    for(Node a=head;a!=null;a=a.next){
      if(count==idx){
        return a.element;
      }
      count++;
    }
    return null;// please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    int count=0;
    Object temp=null;
    for(Node a=head;a!=null;a=a.next){
      if(count==idx){
        temp=a.element;
        a.element=elem;
      }
      count++;
    }
    return temp;// please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count=0;
    for(Node a=head;a!=null;a=a.next){
      if(a.element==elem){
        return count;
      }
      count++;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    for(Node a=head;a!=null;a=a.next){
      if(a.element==elem){
        return true;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newHead=new Node(head.element,null);
    Node end=newHead;
    for(Node a=head.next;a!=null;a=a.next){
      Node n=new Node(a.element,null);
      end.next=n;
      end=n;
    }
    return newHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node newHead=copyList();
    Node prev=null;
    Node current=newHead; 
    Node next=null;
    while(current!=null){
      next=current.next;
      current.next=prev;
      prev=current;
      current=next;
    }
    return prev;  // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if(idx==0){
      Node n=new Node(elem,head);
      head=n;
    }
    else{
      Node n=new Node(elem,null);
      int count=0;
      for(Node a=head;a!=null;a=a.next){
        if(count==idx-1){
          Node temp=a.next;
          a.next=n;
          n.next=temp;
        }
        count++;
      }
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    if(index==0){
      Object n=head.element;
      head=head.next;
      return n;
    }
    else{
      int count=0;
      for(Node a=head;a!=null;a=a.next){
        if(count==index-1){
          Object n=(a.next).element;
          a.next=(a.next).next;
          return n;
        }
        count++;
      }
    }
    return null;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node temp=head;
    head=head.next;
    for(Node a=head;a!=null;a=a.next){
      if(a.next==null){
        a.next=temp;
        temp.next=null;
      }
    }
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node temp=head;
    for(Node a=head;a!=null;a=a.next){
      if((a.next).next==null){
        head=a.next;
        (a.next).next=temp;
        a.next=null;
      }
    }
  }
  
}