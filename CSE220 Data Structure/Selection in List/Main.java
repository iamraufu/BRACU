public class Main {
   public static void main(String[] args) {
      List list = new List();
      list.addtoList(1);
      list.addtoList(2);
      list.addtoList(3);
      list.addtoList(4);
      list.addtoList(5);
      System.out.println("Before sorting");
      list.Print();
      list.selectionSort();
      System.out.println("After sorting");
      list.Print();
   }
}