import java.util.Scanner;
public class Task03{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int [] arr={10,20,30,40,50};
    printArr(arr,arr.length-1);
  }
  public static void printArr(int [] a,int size ){
      if (size==0){
    System.out.print(a[size]+" ");
    }
     else{
       printArr(a,size-1);
      System.out.print(a[size]+" ");
    }
  }
}