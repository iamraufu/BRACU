import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int c[]=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
    }
    for(int i=0;i<c.length;i++){
      c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]+" ");
    }
  }
}