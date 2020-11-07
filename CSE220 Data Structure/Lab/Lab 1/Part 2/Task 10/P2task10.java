import java.util.Scanner;
public class P2task10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]={1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    System.out.println("enter rotate by position");
    int n=sc.nextInt();
    int temp[]=new int[n];
    for(int i=0;i<n;i++){
      temp[i]=array[i];
    }
    int j=0;
    for(int i=n;i<array.length;i++){
      array[j]=array[i];
      j++;
    }
    int k=0;
    for(int i=array.length-n;i<array.length;i++){
      array[i]=temp[k];
      k++;
    }
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
  }
}
