public class designClass {  
  private  Node head;
  private int size; 
  
  public designClass(){
    this.head = null;
    this.size = 0;
  }
  
  public void add(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
    } else {
      Node currentNode = head;
      while(currentNode.nextNode != null) {
        currentNode = currentNode.nextNode;
      }
      currentNode.nextNode = node;
    }
    size++;     
  }
  
  public void sort() {
    if (size > 1) {
      for (int i = 0; i < size; i++ ) {
        Node currentNode = head;
        Node next = head.nextNode;
        for (int j = 0; j < size - 1; j++) {
          if (currentNode.data > next.data) {
            Node temp = currentNode;
            currentNode = next;
            next = temp;
          } 
          currentNode = next;
          next = next.nextNode;                   
        } 
      }
    }
  }
  
  public int listSize() {     
    return size;
  }
  
  public void printData() {
    Node currentNode = head;
    while(currentNode != null) {
      int data = currentNode.getData();
      System.out.print(data + " ");
      currentNode = currentNode.nextNode;
    }
  }
  
  public boolean isEmpty() {
    return size == 0;
  }
}