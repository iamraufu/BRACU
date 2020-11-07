import java.util.Scanner;

public class lab11Task02{
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input five numbers");
    
    int[] arr = new int[5];
    
    
    for(int i = 0; i < arr.length; i++){
      arr[i] = keyboard.nextInt();
    }
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      } 
      
    }
    
    System.out.println(max); 
    
  }
}
