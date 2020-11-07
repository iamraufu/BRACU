public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    } 
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        if(size==0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void enqueue(Object o) throws QueueOverflowException{
        
        Node n=new Node(o,null);
        if(size==0) {
            front= n;
            rear=front;
        }
        else {
            rear.next=n;
            rear=rear.next;
        }
        size++;
    }
    
    
    
    public Object dequeue() throws QueueUnderflowException{
        if(size==0) {
            throw new QueueUnderflowException();
        }
        Object temp=front.val;
        front=front.next;
        size--;
        return temp;
    }
    
    
    public Object peek() throws QueueUnderflowException{
        if(size==0) {
            return new QueueUnderflowException();
        }
        return front.val;
    }
    
    
    public String toString(){
        String a="";
        if(size==0) {
            return "Emty Queue";
        }
        for(Node c=front;c!=null;c=c.next) {
            a+=c.val+" ";
        }
        return a;
    }
public Object[] toArray() {
    Object a[]=new Object[size];
    int i=0;
    for(Node c=front;c!=null;c=c.next) {
        a[i]=c.val;
        i++;
    }
    return a;
}
public int search(Object o){
    int count=0;
    Node tail=front;
    for(Node c=tail;c!=null;c=c.next) {
        if(c.val!=o) {
            count++;
            tail=tail.next;
        }
        else {
            break;
        }
    }
    if(count>0) {
        return count;
    }
    else {
        return -1;
    }
}
}


