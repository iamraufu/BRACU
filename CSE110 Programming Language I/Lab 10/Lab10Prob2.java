import java.util.Scanner;
public class Lab10Prob2{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter 10 numbers");
    for(int i=0;i<10;i++){
      a[i]=kb.nextInt();
    }
    System.out.println("enter a number between 0 to 9");
    int n=kb.nextInt();
    System.out.println(a[n]);
  }
}