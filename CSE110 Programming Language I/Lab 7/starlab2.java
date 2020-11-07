import java.util.Scanner;
public class starlab2{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter a Number");
    
    int input= sc.nextInt();
    
    for(int line=1;line<=input;line++){
      
      System.out.print("*");
      
      
    }
  }
}