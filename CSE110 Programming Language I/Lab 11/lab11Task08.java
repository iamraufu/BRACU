import java.util.Scanner;

public class lab11Task08{
  public static void main(String[] args){
    
    Scanner keyboard = new Scanner(System.in);
    String[] arr = {"Zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    
    System.out.print("Give me a number between 1 to 9");
    int num = keyboard.nextInt();
    
    System.out.print(arr[num]);
    
  }
}