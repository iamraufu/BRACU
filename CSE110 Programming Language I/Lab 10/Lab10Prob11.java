import java.util.Scanner;
public class Lab10Prob11{
  public static void main(String[]args){
    int c=0;
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter 10 numbers");
    for(int i=0;i<10;i++){
      int n=kb.nextInt();
      c=0;
      for(int j=0;j<=i;j++){
        if(a[j]==n)
        {c++;}
    }
      if(c==0)
        a[i]=n;
      else
      {
        System.out.println("enter a different number");
        int n2=kb.nextInt();
        a[i]=n2;
      }
    }
  }
}