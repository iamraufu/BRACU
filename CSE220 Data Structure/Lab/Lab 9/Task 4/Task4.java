public class Task4{
  public static void main(String[]args){
    int a[]={10,25,15,5,20};
    Node head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=n;
    }
    selectionSort(head);
    for(Node i=head;i!=null;i=i.next){
      System.out.println(i.element);
    }
  }
  public static void selectionSort(Node a){
    if(a.next==null){
      return;
    }
    else{
      sort(a.next,a);
    }
    selectionSort(a.next);
  }
  
  public static void sort(Node j,Node i){
    if(j.next==null){
      return;
    }
    else{
      if(j.element<i.element){
        int temp=i.element;
        i.element=j.element;
        j.element=temp;
      }
      sort(j.next,i);
    }
  }
}