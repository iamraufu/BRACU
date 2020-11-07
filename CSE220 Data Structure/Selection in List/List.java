class List{
   private int length;
   private Node start;
   private Node end;
   
   
   public void addtoList(int value){
      Node fn = new Node(value);
      if(length ==0){
         fn.next = null; 
      }
      else{
         fn.next = start;
      }
      start = fn;
      length++;
   }
   
   
   public void Print(){
      Node fn = start;
      while(fn != null){
         System.out.print(fn.value + " ");
         fn = fn.next;
      }
      System.out.println();      
   }
   
   public void selectionSort(){
      for(Node fn1 = start; fn1!=null; fn1 = fn1.next){
         Node min = fn1;
         for(Node sn = fn1; sn!=null; sn = sn.next){
            if(min.value > sn.value){
               min = sn;
            }
         }
         
         Node temp = new Node(fn1.value);
         fn1.value = min.value;
         min.value = temp.value;
      }
   }
   
}