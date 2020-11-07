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

    public int size(){
        return size;
    }
    

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void enqueue(Object o) throws QueueOverflowException{
        if (data.length == size){
            throw new QueueOverflowException();
        }
        else if(size==0){
            data[size] = o;
            size++;
            front++;
            rear++;
        }
        else{
            rear = (rear+1)%data.length;
            data[rear] = o;
            size++;
        }
        
    }
    
    public Object dequeue() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException();
        }
        else{
            Object temp = data[front];
            data[front] = null;
            front = (front+1)%data.length;
            size--;
            return temp;
        }
    }
    
    public Object peek() throws QueueUnderflowException{
        if(size == 0){
            throw new QueueUnderflowException();
        }
        else{
            return data[front];
        }
    }
    
    public String toString(){
        if(size==0){
            return "Empty Queue";
        }
        String out ="[ ";
        int j = front;
        for(int i = 0 ; i<size; i++){
            out = out+data[j]+" ";
            j = (j+1)%data.length;
        }
        out = out+"]";
        return out;
    }
    
    public Object[] toArray(){
        Object[] arr = new Object[size];
        int i = front;
        for(int j = 0 ; j<size ; j++){
            arr[j] = data[i];
            i = (i+1)%data.length;
        }
        return arr;
    }
    
    public int search(Object o){
        int count = 0;
        for(int i = 0 ; i<data.length ; i++){
            if(data[i] == o){
                return count;
            }
            count++;
        }
        
        return -1;
    }
}
