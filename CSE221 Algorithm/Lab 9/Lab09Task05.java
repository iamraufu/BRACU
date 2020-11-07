import java.util.Scanner;

public class Lab09Task05{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter value of m");
    int m = sc.nextInt();
    System.out.println("Enter value of n");
    int n = sc.nextInt();
    System.out.println("Ans> "+ calc(m , n));
  }
  
  static int calc (int m , int n){
    if(n == 0){
      return 1;
    }
    if(n == 1){
      return m;
    }
    n--;
    return m*calc(m,n);
  }
}