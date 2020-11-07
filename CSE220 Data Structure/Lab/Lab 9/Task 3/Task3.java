public class Task3{
  public static void main(String[]args){
    int a[]={10,25,15,5,20};
    Node head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=n;
    }
    bubbleSort(head,head);
    for(Node i=head;i!=null;i=i.next){
      System.out.println(i.element);
    }
  }
  public static void bubbleSort(Node a,Node b){
    if(b.next==null){
      return;
    }
    else{
      sort(a);
    }
    bubbleSort(a,b.next);
  }
  
  public static void sort(Node j){
    if(j.next==null){
      return;
    }
    else{
      if(j.next.element<j.element){
        int temp=j.element;
        j.element=j.next.element;
        j.next.element=temp;
      }
      sort(j.next);
    }
  }
}