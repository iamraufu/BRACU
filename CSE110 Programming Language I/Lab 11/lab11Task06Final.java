import java.util.Scanner;

public class lab11Task06Final{
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many numbers do you want to input");
    int lim = keyboard.nextInt();
    int[] arr = new int[lim];
    for(int i = 0; i < arr.length; i++){
      arr[i] = keyboard.nextInt();
    }
    int n = arr.length;
    for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
      if (arr[j] > arr[j+1])
    {
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
    int   m = arr.length;
    for (int i = 0; i < m-1; i++)
      for (int j = 0; j < m-i-1; j++)
      if (arr[j] > arr[j+1])
    {
      
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
    int o = arr.length;
    for (int i = 0; i < o-1; i++)
      for (int j = 0; j < o-i-1; j++)
      if (arr[j] > arr[j+1])
    {
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
    int k = arr.length;
    for (int i = 0; i < k-1; i++)
      for (int j = 0; j < k-i-1; j++)
      if (arr[j] > arr[j+1])
    {
      
      int temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
    }
    int hm = arr.length;
    for (int i=0; i<hm; ++i){
      System.out.print(arr[i] + " ");
      
    }
    
    int len = arr.length;
    if(len % 2 != 0){
      int middle = len / 2;
      System.out.println("Middle Point is" + " " +arr[middle]);
    }else{ 
      int middle = len /2;  
      int middleOne = (len /2) - 1 ;
      System.out.println("Middle Point is" + " " +arr[middleOne]);
      System.out.println("Middle Point is" + " " +arr[middle]);
    }
  }
}