public class Doubly{
    
    public static void insertsort(Node head, Node n){
        if(n == null){
            return;
        }
        else{
            int key = n.value;
            Node pred = n.prev;
            sort(head, pred, key);
            n = n.next;
            insertsort(head,n);
        }
    }
    
    public static void sort(Node head, Node pred, int key){
        if(pred == null){
           head.value = key;
           return;
        }
        else{
            if(pred != null && key < pred.value){
                pred.next.value = pred.value;
                pred = pred.prev;
                sort(head, pred, key);
            }
        }
    }
    
    
     public static void print(Node x){
        if(x == null){
        }
        else{
            System.out.print(x.value+" ");
            x = x.next;
            print(x);
        }
    }
    
     
      public static void main (String [] args){
        int [] a = {10,600,4,70000,3};
        Node head = null;
        head = new Node(a[0],null,null);
        Node tail = head;
        for(int i=1;i<a.length;++i){
            Node x = new Node(a[i],null,null);
            x.prev = tail;
            tail.next = x;
            tail = x;
        }
        insertsort(head,head.next);
        print(head);
    }
}

   