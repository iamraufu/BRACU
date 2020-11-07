import java.util.Scanner;
public class Lab10Prob7{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter 10 numbers");
    for(int i=0;i<10;i++){
      a[i]=kb.nextInt();
    }
    for(int i=9;i>=0;i--){
      if(a[i]%2==0){
        System.out.println(a[i]);break;}
    }
  }
}