import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[51];
    for(int i=0;i<a.length;i++){
      a[i]=-1;
    }
    System.out.println("enter a number");
    int n=sc.nextInt();
    System.out.println(fib(n,a));
  }
  public static int fib(int i,int a[]){
    if(i<2){
      return i;
    }
    if(a[i]!=-1){
      return a[i];
    }
    a[i]=fib(i-1,a)+fib(i-2,a);
    return a[i];
  }
}
    