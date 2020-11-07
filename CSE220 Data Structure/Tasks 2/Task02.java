import java.util.Scanner;
public class Task02{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please eneter a value");
    int n=sc.nextInt();
    System.out.println(n+" fibo : "+F(n));
  }
  public static int F(int n){

      if (n == 0){
      return 0;
    }
  else  if( n == 1){
      return 1;
    }
    else{
      return F(n-1) + F(n-2);
    }
  }
}