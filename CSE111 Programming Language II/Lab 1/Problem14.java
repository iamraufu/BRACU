import java.util.Scanner;
public class Problem14{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int spC=n-1;spC>=i;spC--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      for(int k=i-1;k>=1;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}

