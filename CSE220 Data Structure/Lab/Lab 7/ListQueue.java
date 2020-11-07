public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    // The number of items in the queue
    public int size(){
      return size;
    }
    
// Returns true if the queue is empty
    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      return false;
    }
    
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException{
      if(size==0){
        Node n=new Node(o,null);
        front=n;
        rear=n;
        size++;
      }
      else{
        Node a=new Node(o,null);
        rear.next=a;
        rear=rear.next;
        size++;
      }
    }
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{
      Object temp=null;
      int c=0;
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
        for(Node a=front;a!=null;a=a.next){
          c++;
          if(c==size-1){
            temp=a.next.val;
            a.next=null;
            size--;
            rear=a;
          }
        }
      }
      return temp;
    }

// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }
      return front.val;
    }

// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){
      String s="[ ";
      for(Node a=front;a!=null;a=a.next){
        s=s+a.val+" ";
      }
      s=s+"]";
      return s;
    }

// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){
      Object arr[]=new Object[size];
      int i=0;
      for(Node a=front;a!=null;a=a.next){
        arr[i]=a.val;
        i++;
      }
      return arr;
    }

// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){
      int c=0;
      for(Node a=front;a!=null;a=a.next){
        if(a.val==o){
          return c;
        }
      }
      return -1;
    }
}