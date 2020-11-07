import java.util.Scanner;

public class lab08task06{
  public static void main (String[]args){
    
    Scanner sc = new Scanner (System.in);
    
    binary_search s = new binary_search();
    int[] arr = {65, 56, 23, 1, -2, 81, 45};
    arr =s.sort(arr);
    
    System.out.println("Enter the element you want to search:");
    int x = sc.nextInt();
    int index = s.search(arr, x);
    if(index==-1){
    System.out.println("Not Found");
    }
    else{
      System.out.println("Found at Index: "+index);
    }
  
  }
}
    