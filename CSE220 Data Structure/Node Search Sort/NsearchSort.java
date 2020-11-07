import java.util.*;
public class NsearchSort{
    
    public static Node minimum(Node x, Node index, Node min){
        if(index == null){
            return min;
        }
        else{
            if(index.age < min.age){
                min = index;
            }
            return minimum(x, index.next, min);
        }
    }
    
    public static void selectsort(Node head, Node i){
        if(i == null){
            return;
        }
        else{
            Node min = minimum(head, i.next, i);
            int temp1 = min.age;
            String temp2 = min.name;
            int temp3 = min.id;
            
            min.age = i.age;
            min.name = i.name;
            min.id = i.id;
            
            i.age = temp1;
            i.name = temp2;
            i.id = temp3;
            
            selectsort(head, i.next);
        }
    }
    
    
    public static void seqsearch(int count, Node n, int key){
        if( n == null && count == 0 ){
            return;
        }
        if( n == null && count !=0 ){
            return;
        }
        else{
            if( key == n.id ){
                System.out.print(n.name+" "+n.age+" "+n.id);
                n = n.next;
                ++count;
                seqsearch(count, n, key);
            }
            else{
                n = n.next;
                seqsearch(count, n, key);
            }
        }
    }
     
    
    public static void print(Node n){
        if(n == null){
            return;
        }
        else{
            System.out.println(n);
            n = n.next;
            print(n);
        }
    }
    
    
    public static void main(String [] args){
        
        Scanner k = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        
        for(int i=0; i<3; ++i){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("give name");
            String name = sc.nextLine();
            
            System.out.print("give age");
            int age = sc.nextInt();
            
            System.out.print("give id");
            int id = sc.nextInt();
            
            Node x = new Node(name, age, id, null);
            if(x == head){
                head = x;
                tail = head;
            }
            else{
                tail.next = x;
                tail = x;
            }
        }
        
        
        System.out.print("enter number 1 for sort and 2 for search");
        int num = k.nextInt();
        if(num == 1){
            selectsort(head, head);
            print(head);
        }
        else{
            System.out.print("give id");
            int idnum = k.nextInt();
            seqsearch(0, head, idnum);
        }
    }
    
    
    
    
}
      
        