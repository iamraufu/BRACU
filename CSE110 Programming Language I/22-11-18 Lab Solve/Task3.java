import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Five Numbers");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int max=a[0];
    int maxIndex=0;
    int min=a[0];
    int minIndex=0;
    for(int i=1;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        maxIndex=i;
      }
      if(a[i]<min){
        min=a[i];
        minIndex=i;
      }
    }
    System.out.println("Largest number "+ max+ " was found at location "+ maxIndex);
    System.out.println("Smallest number "+ min+ " was found at location "+ minIndex);
  }
}