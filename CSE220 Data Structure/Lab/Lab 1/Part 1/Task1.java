import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      if((a[0]==6 && a[a.length-1]!=a[0])|| (a[a.length-1]==6 && a[a.length-1]!=a[0])){
        System.out.println("true");
        break;
      }
      else{
        System.out.println("false");
        break;
      }
    }
  }
}
