import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      a[i]=sc.nextInt();
      for(int j=0;j<i;j++){
        if(a[j]==a[i]){
          System.out.println(a[j]+" is already in the list");
          i--;
        }
      }
    }
  }
}

  