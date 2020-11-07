public class SinglyR{
    public static void main(String [] args){
        
        int [] a = {10,600,4,70000,3};
        Node head = null;
        head = new Node(a[0],null,null);
        Node tail = head;
        for(int i=1; i<a.length; ++i){
            Node x = new Node(a[i],null,null);
            tail.next = x;
            tail = x;
        }
        selectsort(head,head);
        print(head);
    }
    
    public static Node minimum(Node n, Node index, Node min){
        if(index == null){
            return min;
        }
        else{
            if(index.value < min.value){
                min = index;
            }
            return minimum(n, index.next, min);
        }
    }
    
    
    public static void selectsort(Node head, Node i){
        if(i == null){
            return;
        }
        else{
            Node min = minimum(head,i.next,i);
            int temp = min.value;
            min.value = i.value;
            i.value = temp;
            selectsort(head,i.next);
        }
    }
    
    public static void print(Node n){
        if(n == null){
            return;
        }else{
            System.out.print(n.value+" ");
            n = n.next;
            print(n);
        }
    }
    
}