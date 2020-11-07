public class ListStack implements Stack{
    int size;
    Node top;
    
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
// The number of items on the stack
    public int size(){
        return -1;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        return false;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        return null;
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        return null;
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        return null;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        return null;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        return -1;
    }
}