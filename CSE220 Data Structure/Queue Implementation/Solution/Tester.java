import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner k = new Scanner(System.in);
    int selection;
    while(true){
      try{
        System.out.println("Please, enter:\n1 to select array based queue\n2 to select linked list based queue");
        selection = k.nextInt();
        if(selection!=1 && selection!=2)
        System.err.println("Wrong Selection! Please, try Again.");
        else break;
      }
      catch(Exception e){
        System.err.println("Input Format Mismatch! Please, try Again.");
        k.next();
      }
    }
    Queue queue;
    if(selection==1) queue = new ArrayQueue();
    else queue = new ListQueue();
    for(int x=1;x<=12;x+=2){
      try{
        queue.enqueue(x);
      }
      catch(QueueOverflowException e){
        System.err.println("Queue Full! Cannot Enqueue\n"+e);
      }
    }
    System.out.println("toString Output:"+queue.toString());
    Object[]array=queue.toArray();
    for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
    System.out.println("size: "+queue.size());
    System.out.println("isEmpty: "+queue.isEmpty());
    System.out.println("Distance of '1' from the top: "+queue.search(1));
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    System.out.println("size: "+queue.size());
    System.out.println("isEmpty: "+queue.isEmpty());
    System.out.println("Distance of '1' from the top: "+queue.search(1));
    
    array=queue.toArray();
    for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
    try{
      System.out.println("Peeked: "+queue.peek());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    System.out.println("toString Output:"+queue.toString());
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    try{
      System.out.println("Dequeued: "+queue.dequeue());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    try{
      System.out.println("Peeked: "+queue.peek());
    }catch(QueueUnderflowException e){
      System.err.println("Queue Empty\n"+e);
    }
    array=queue.toArray();
    for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
    System.out.println("toString Output: "+queue.toString());
    System.out.println("size: "+queue.size());
    System.out.println("isEmpty: "+queue.isEmpty());
    System.out.println("Distance of '1' from the top: "+queue.search(1));
    
  }
}
