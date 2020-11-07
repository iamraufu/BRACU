public class Node{
  Object element;
  Node left;
  Node right;
  Node parent;
  public Node(Object e, Node l, Node r, Node p){
    element = e;
    left = l;
    right = r;
    parent = p;
  }
}