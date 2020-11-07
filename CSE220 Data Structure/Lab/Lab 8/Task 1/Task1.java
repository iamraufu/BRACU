import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    int result=Factorial(a);
    System.out.println("factorial of "+a+" is "+result);
  }
  public static int Factorial(int a){
    int prod=1;
    if(a==1){
      return 1;
    }
    prod=Factorial(a-1)*a;
    return prod;
  }
}