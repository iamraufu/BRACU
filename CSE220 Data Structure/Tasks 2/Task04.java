import java.util.Scanner;
public class Task04{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);    
    System.out.print("enter a value");
    int n=sc.nextInt();
   System.out.print(binary(n));
  }
   public static String binary( int num ){
      return  Integer.toBinaryString(num);
    }
  }
