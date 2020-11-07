import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int result=fibo(n);
    System.out.println("the "+n+" Fibonacci number is "+result);
  }
  public static int fibo(int a){
    if(a<2){
      return a;
    }
    else{
      return fibo(a-1)+fibo(a-2);
    }
  }
}