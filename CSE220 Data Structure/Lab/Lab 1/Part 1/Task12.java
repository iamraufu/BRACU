import java.util.Scanner;
public class Task12{
  public static boolean comesFirst(int a,int b,int c,int d){
    if(a<c || (a<=c && b<d) ){
      return true;
    }
    return false;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter First month and date");
    int m1=sc.nextInt();
    int d1=sc.nextInt();
    System.out.println("enter Second month and date");
    int m2=sc.nextInt();
    int d2=sc.nextInt();
    System.out.println(comesFirst(m1,d1,m2,d2));
  }
}