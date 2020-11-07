public class Node{
    
    public String name = null;
    
    public int age = 0;
    
    public int id = 0;
    
    Node next = null; 
    
    public Node(String n,int a,int i,Node nn){
        name = n;
        age = a;
        id = i;
        next = nn;
    }
}