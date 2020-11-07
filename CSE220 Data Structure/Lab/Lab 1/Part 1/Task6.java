import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter length");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int b[]=new int[n/2];
    int c[]=new int[n/2];
    for(int i=0;i<b.length;i++){
      b[i]=a[i];
    }
    int j=a.length-1;
    for(int i=0;i<c.length;i++){
      c[i]=a[j];
      j--;
    }
    for(int i=0;i<b.length;i++){
      if(c[i]==b[i]){
        count++;
      }
    }
    if(count==n/2){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a palindrome");
    }
  }
}
      