import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    binary(a);
  } 
 public static void binary(int n){
    int c=n%2;
    if(n/2==0){
      System.out.print(n%2);
    }
    else{
      binary(n/2);
      System.out.print(c);
    }
  }
}