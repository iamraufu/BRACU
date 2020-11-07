import java.util.Scanner;
public class problem1{
  public static void main ( String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter first number");
    int num1= sc.nextInt();
    System.out.println("Enter second number");
    int num2= sc.nextInt();
    System.out.println("Enter third number");
    int num3= sc.nextInt();
    System.out.println("Enter fourth number");
    int num4= sc.nextInt();
    if(num1>num2){
      if(num1>num3){
        if(num1>num4){
          System.out.println("Max is"+ num1);
        }
        else {
          if(num4>num1){
            System.out.println("Max is "+ num4);
          }
        }
      }
      else{
        if(num3>num1){
          System.out.println("Max is"+ num3);
        }
        else {
          if(num2>num1){
            System.out.println("Max is "+ num2);
          }
        }
      }
    }
  }
}