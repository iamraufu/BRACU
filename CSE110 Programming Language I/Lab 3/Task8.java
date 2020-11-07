import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter first number");
  int num1= sc.nextInt();
  System.out.println("Enter second number");
  int num2= sc.nextInt();
  if (num1>num2){
  int subtract= num1-num2;
  System.out.println(subtract);
  }
  else{
  int subtract=num2-num1;
  System.out.println(subtract);
  }
  }
}