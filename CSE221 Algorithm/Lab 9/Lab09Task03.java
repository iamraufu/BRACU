public class Lab09Task03{
  public static void main (String[]args){
    int[] a = {1, 2 , 3 , 4 , 5};
    print(a, 0);
  }
  
  static void print(int[] a , int c){
    if(c<a.length){
      System.out.println(a[c]);
      c++;
      print(a, c);
    }
  }
}