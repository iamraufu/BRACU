import java.util.Scanner;
public class Task3{
  public static void main(String [] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter First Number");
    double num1 = sc.nextInt();
    System.out.println("Please Enter Second Number");
    double num2 = sc.nextDouble(); 
    double sum = num1+num2;
      double product=num1*num2;
      double difference= num1-num2;
      System.out.println(sum);
       System.out.println(product);
        System.out.println(difference);
  }
}