import java.util.Scanner;

public class Lab09Task04{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a decimal value");
    int n = sc.nextInt();
    System.out.println("Binary output of "+n+" is "+bin(n));
  }
  
  static String bin (int n){
    if (n == 0){
      return "0";
    }
    else{
      return (n%2)+""+bin(n/2);
    }
  }
}