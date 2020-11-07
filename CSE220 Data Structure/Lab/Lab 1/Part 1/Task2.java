import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int max=a[0];
    int min=a[0];
    int maxIn=0,minIn=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        maxIn=i;
      }
      if(a[i]<min){
        min=a[i];
        minIn=i;
      }
    }
    a[maxIn]=min;
    a[minIn]=max;
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+",");
    }
  }
}