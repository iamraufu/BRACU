import java.util.Scanner;
public class Problem12{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=n;i>=1;i--){
      for(int spC=1;spC<i;spC++){
        System.out.print(" ");
      }
      for(int j=i;j<=n;j++){
         System.out.print(j);
      }
      System.out.println();
    }  
  }
}

