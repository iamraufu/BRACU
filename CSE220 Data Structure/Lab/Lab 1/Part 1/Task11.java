import java.util.Scanner;
public class Task11{
  public static boolean allDigitsOdd(int n){
    for(int i=n;i>0;i=i/10){
      if((i%10)%2==0){
        return false;
      }
    }
    return true;
  }
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(allDigitsOdd(a));
  }
}