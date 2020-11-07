public class Task5{
  public static void main(String[]args){
    int a[]={10,5,15,25,20};
    DoublyNode head=new DoublyNode(a[0],null,null);
    DoublyNode tail=head;
    for(int i=1;i<a.length;i++){
      DoublyNode n=new DoublyNode(a[i],null,null);
      tail.next=n;
      n.prev=tail;
      tail=n;
    }
    insertionSort(head.next);
    for(DoublyNode i=head;i!=null;i=i.next){
      System.out.println(i.element);
    }
  }
  public static void insertionSort(DoublyNode a){
    if(a==null){
      return;
    }
    else{
      sort(a);
    }
    insertionSort(a.next);
  }
  
  public static void sort(DoublyNode j){
    if(j.prev==null){
      return;
    }
    else{
      if(j.element<j.prev.element){
        int temp=j.element;
        j.element=j.prev.element;
        j.prev.element=temp;
      }
      sort(j.prev);
    }
  }
}