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
        Node temp = head;
        int count = 0;
        while(temp.next!=head){
            count++;
            temp = temp.next;
        }
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node temp = head;
        for(temp = temp.next ; temp.next!=head ; temp = temp.next){
            System.out.print(temp.element+", ");
        }
        System.out.println(temp.element);
    }
    
    public void backwardprint(){
        Node temp = head;
        for(temp = head.prev ; temp.prev!=head ; temp = temp.prev){
            System.out.print(temp.element+", ");
        }
        System.out.println(temp.element);
    }
    
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        Node temp = head.next;
        int count = 0;
        while(temp!=head){
            if(count == idx){
                break;
            }
            count++;
            temp = temp.next;
        }
        
        return temp; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        Node temp = head;
        int index = -1;
        int count = 0;
        for(temp = temp.next ; temp!=head ; temp = temp.next){
            if(temp.element == elem){
                index = count;
                break;
            }
            count++;
        }
        
        
        return index; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node t = new Node(elem , null , null);
        Node x = null;
        Node y = null;
        Node temp = head;
        int c = countNode();
        if(idx<0 || idx>c){
            
        }
        else{
            
            for(int i = 0 ; i<=idx ; i++){
                temp = temp.next;
            }
            x = temp.prev;
            y = temp;
            x.next = t;
            t.next = y;
            t.prev = x;
            y.prev = t;
            
        }
    }
    
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Node temp = head;
        Node y = null;
        Node x = null;
        Node z = null;
        int c = countNode();
        if(index<0 || index>c){
        }
        else{
            for(int i = 0 ; i<=index ; i++){
                temp = temp.next;
            }
            y = temp;
            x = temp.prev;
            z = temp.next;
            x.next = z;
            z.prev = x;
        }
        
        
        return y.element;
    }
    
    
    
}