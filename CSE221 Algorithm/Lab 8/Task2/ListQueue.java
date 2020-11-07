public class ListQueue implements Queue{
  int size;
  Node front;
  Node rear;
  
  
  public ListQueue(){
    size = 0;
    front = null;
    rear = null;
  }
  
  public int size(){
    return size;
  }
  
  

  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    else{
      return false;
    }
  }
  

  public void enqueue(Object o) throws QueueOverflowException{
    Node t = new Node (o , null);
    if(size == 0){
      front = t;
      rear = t;
    }
    else{
      rear.next = t;
      rear = rear.next;
    }
    size++;
    
  }
  

  public Object dequeue() throws QueueUnderflowException{
    if (size == 0){
      throw new QueueUnderflowException();
    }
    else{
      Object t = front.val;
      front = front.next;
      size--;
      return t;
    }
  }
  

  public Object peek() throws QueueUnderflowException{
    if(size==0){
      throw new QueueUnderflowException();
    }
    else{
      return front.val;
    }
  }
  
  
  public String toString(){
    if(size == 0){
      return "Empty Queue";
    }
    String s = "[ ";
    for(Node temp = front ; temp!=null ; temp = temp.next){
      s = s+temp.val+" ";
    }
    s = s+"]";
    return s;
  }
  
  public Object[] toArray(){
    Object a[] = new Object[size];
    Node temp = front; 
    for(int i = 0 ; i<size ; i++){
      a[i] = temp.val;
      temp = temp.next;
    }
    return a;
  }
  
  public int search(Object o){
    int count = 0;
    for(Node temp = front ; temp!=null ; temp = temp.next){
      if(temp.val == o){
        return count;
      }
      count++;
    }
    
    return -1;
    
  }
}
