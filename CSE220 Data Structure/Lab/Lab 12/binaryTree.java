public class binaryTree{
    static Node root;
    public static void printAscending(Node root){
        if(root==null)return;
        printAscending(root.left);
        System.out.print(root.element+" ");
        printAscending(root.right);
    }
    public static void printDescending(Node root){
        if(root==null)return;
        printDescending(root.right);
        System.out.print(root.element+" ");
        printDescending(root.left);
    }
    public static boolean search(Node root,int i){
        if(root==null)return false;
        if(root.element==i)return true;
        
        if(i<root.element)search(root.left,i);
        search(root.right,i);
        return false;
    }
    public static void main(String[]args){
        Node n1=new Node(20,null,null);
        Node n2=new Node(5,null,null);
        Node n3=new Node(25,null,null);
        Node n4=new Node(4,null,null);
        Node n5=new Node(10,null,null);
        Node n6=new Node(7,null,null);
        Node n7=new Node(12,null,null);
        Node n8=new Node(11,null,null);
        Node n9=new Node(24,null,null);
        Node n10=new Node(26,null,null);
        root=n1;
        n1.left=n2;
        n2.left=n4;
        n2.right=n5;
        n5.left=n6;
        n5.right=n7;
        n7.left=n8;
        n1.right=n3;
        n3.left=n9;
        n3.right=n10;
        printAscending(root);
        System.out.println();
        printDescending(root);
        System.out.println();
        System.out.println(search(root,200));
        
    }
}