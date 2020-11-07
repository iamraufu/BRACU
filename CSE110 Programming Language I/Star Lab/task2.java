import java.util.Scanner;
public class task2{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number of stars");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
  System.out.print("*");
  }
  }
}