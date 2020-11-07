import java.util.Scanner;
public class Task05{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);    
    System.out.print("enter a value");
    int n=sc.nextInt();
   System.out.print(sqr(n));
  }
   public static int sqr( int num ){
      return  (num*num);
    }
  }
