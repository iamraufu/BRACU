public class BST{


//SORTING
public void inorderprint(Node root){
  if(root==null){
  
  return;
  }
  else{
  
  
  inorderprint(root.left);
  System.out.println(root.elem);
  inorderprint(root.right);
  }

}

//SEARCHING
public int search(Node root,int elem){

return -1; \\remove this line
}



public static void main(String [] args){
Node n1=new Node(50,null,null,null);
Node n2=new Node(40,n1,null,null);
Node n3=new Node(60,n1,null,null);
n1.left =n2;
n1.right=n3;

Node root=n1;

Node n4=new Node(30,n2,null,null);
Node n5=new Node(45,n2,null,null);
n2.left=n4;
n2.right=n5;

Node n6=new Node(70,n3,null,null);
n3.right=n6;

BST B=new BST();
B.inorderprint(root);

}
}