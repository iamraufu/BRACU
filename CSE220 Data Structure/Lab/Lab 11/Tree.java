public class Tree
{
  public static void main(String[]args)
  {
    Node n1= new Node(20,null,null,null);
    Node n2=new Node(30,null,null,null);
    n2.parent=n1;n1.left=n2;
    Node n3=new Node(35,null,null,null);
    n3.parent=n1;n1.right=n3;
    Node n4=new Node(40,null,null,null);
    n4.parent=n3;n3.left=n4;
    Node n5=new Node(42,null,null,null);
    n5.parent=n3;n3.right=n5;
    Node n6=new Node(48,null,null,null);
    n6.parent=n4;n4.left=n6;
    Node n7=new Node(50,null,null,null);
    n7.parent=n4;n4.right=n7;
    
    System.out.println("Height: "+getHeight(n1));
    System.out.println("Level: "+level(n7));
    System.out.println("Pre-Order Print: " );
    preOrderPrint(n1);
    System.out.println();
    System.out.println("In-Order Print: " );
    inOrderPrint(n1);
    System.out.println();
    System.out.println("Post-Order Print: " );
    postOrderPrint(n1);
    System.out.println();
    
    Node r1= new Node(20,null,null,null);
    Node r2=new Node(30,null,null,null);
    r2.parent=r1;r1.left=r2;
    Node r3=new Node(35,null,null,null);
    r3.parent=r1;r1.right=r3;
    Node r4=new Node(40,null,null,null);
    r4.parent=r3;r3.left=r4;
    Node r5=new Node(42,null,null,null);
    r5.parent=r3;r3.right=r5;
    Node r6=new Node(48,null,null,null);
    r6.parent=r4;r4.left=r6;
    Node r7=new Node(50,null,null,null);
    r7.parent=r4;r4.right=r7;
    System.out.println("Trees exactly same or not: "+equal(n1, r1));
    System.out.println("Root item of new Node is: "+copy(n1).element);
  }


    public static int getHeight(Node r)
  {
    if(r==null) 
      return -1;
    else
      return 1+max(getHeight(r.left),getHeight(r.right));
  }
  
  public static int max(int l, int r){
    if(l>r)
      return l;
    else
      return r;
  }   
  public static int level(Node n){
    if(n.parent==null){
      return 0;
    }
    else{
      return 1+level(n.parent);
    }
  }
   public static void preOrderPrint(Node r){
    if(r!=null)
    {
      System.out.print(r.element+" ");
      preOrderPrint(r.left);
      preOrderPrint(r.right);
    }
  }
   public static void inOrderPrint(Node r){
    if(r!=null){
      inOrderPrint(r.left);
      System.out.print(r.element+" ");
      inOrderPrint(r.right);
    }
  }
   public static void postOrderPrint(Node r){
    if(r!=null){
      postOrderPrint(r.left);
      postOrderPrint(r.right);
      System.out.print(r.element+" ");
    }
  }
  public static boolean equal(Node r1, Node r2){
    if(r1==null && r2==null) 
      return true;
    if(getHeight(r1)!=getHeight(r2)) 
      return false;
    if(r1!=null && r2==null) 
      return false;
    if(r1==null && r2!=null) 
      return false;
    
    else if(r1.element.equals(r2.element)){
      if(equal(r1.left,r2.left)==true&&equal(r1.right,r2.right)==true)
        return true;
    }
    return false;
  }
  
   public static Node copy(Node r){
   Node copyNode;
    if(r==null) 
      return null;
    else
    {
     copyNode=new Node(r.element,copy(r.left), copy(r.right),r.parent);
    }
    return copyNode;
  }
  
}
   