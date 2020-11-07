import java.util.Scanner;
public class Task9{
  public static void squareAll(int []b,int c){
    for(int i=0;i<c;i++){
      b[i]=b[i]*b[i];
    }
  }
  public static void displayAll(int []b,int c){
    for(int i=0;i<c;i++){
      System.out.print(b[i]+",");
    }
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    squareAll(a,a.length);
    displayAll(a,a.length);
  }
}

