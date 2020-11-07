import java.util.Scanner;
public class Task9{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Please enter a number");
  int num= sc.nextInt();
  if (num%2==0){
  System.out.println("Even");
  }
  else{
  System.out.println("Odd");
  }
  }
}