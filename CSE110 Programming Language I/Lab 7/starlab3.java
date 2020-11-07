import java.util.Scanner;
public class starlab3{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int i= sc.nextInt();
    
    System.out.println("Please Enter col ");
    
    int j = sc.nextInt();
    
    for(int line=1;line<=i;line++){
      
      for(int col=1;col<=j;col++){
        
        
        
        System.out.print("*");
        
      }
      
      System.out.print("\n");
      
      
    }
  }
}