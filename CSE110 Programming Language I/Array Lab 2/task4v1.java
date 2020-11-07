import java.util.Scanner;
public class task4v1{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Five Numbers");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length-1;i++){
    int min=a[i];
    int minIndex=i;
    for(int j=i;j<a.length;j++){
        if(a[j]<min){
        min=a[j];
        minIndex=j;
        }
    }
    int temp=a[i];
    a[i]=min;
    a[minIndex]=temp;
    }
    for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
    }
    }
}