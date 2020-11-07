import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int m=sc.nextInt();
    System.out.println("Enter the power");
    int n=sc.nextInt();
    System.out.println(findPower(m,n));
  }
  public static int findPower(int a,int b){
    if(b==0){
      return 1;
    }
    else{
      return a*findPower(a,b-1);
    }
  }
}
    
  