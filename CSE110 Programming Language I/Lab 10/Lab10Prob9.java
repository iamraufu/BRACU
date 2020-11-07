import java.util.Scanner;
public class Lab10Prob9{
  public static void main(String[]args){
    int c=0;
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter 10 numbers");
    for(int i=0;i<10;i++){
      a[i]=kb.nextInt();
    }
    System.out.println("enter a number");
    int n=kb.nextInt();
    for(int i=9;i>=0;i--){
      if(a[i]==n){
        System.out.println("yes");
      c++;}
    }
    if(c==0)
      System.out.println("no");
  }
}