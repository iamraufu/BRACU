public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
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
    public void enqueue(Object o) throws QueueOverflowException {  
        if(size==data.length) {
            throw new QueueOverflowException();
        }
        else {
            if(size==0) {
                front=0;
            }
                rear=(rear+1)%data.length;
                data[rear]=o;
                size++;
            }
    }
    
    public Object dequeue() throws QueueUnderflowException {
        if(size==0) {
            throw new QueueUnderflowException();
        }
        Object temp=data[front];
        data[front]=null;       
        size--;
        front=(front+1)%data.length;
        return temp;
    }
    public Object peek() throws QueueUnderflowException {
        if(size==0) {
            throw new QueueUnderflowException();
        }
        return data[front];
    }
    public String toString() {
        if(size==0) {
            return "Empty Queue";
        }
        String s="";       
        for(int c=0;c<size;c++) {
            s+=data[(c+front)%data.length]+" ";            
        }
        return s;
    }
    public Object[] toArray() {
        Object a[]=new Object[data.length];
        for(int c=0;c<size;c++) {
            a[c]=data[(c+front)%data.length];
           
        }
        return a;
    }
    public int search(Object o) {
        int count=0;
        for(int c=0;c<size;c++) {
            if(data[c]==o) { 
                return count;
            }
            else {
                count++;
            }           
        }
        return -1;
    }
}
        
  





