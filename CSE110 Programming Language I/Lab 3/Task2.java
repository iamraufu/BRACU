import java.util.Scanner;
public class Task2{
  public static void main(String [] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter First Number");
    int num1 = sc.nextInt();
    System.out.println("Please Enter Second Number");
    int num2 = sc.nextInt(); 
    int sum = num1+num2;
      int product=num1*num2;
      int difference= num1-num2;
      System.out.println(sum);
       System.out.println(product);
        System.out.println(difference);
  }
}