import java.util.Scanner;
public class starlab10{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int i= sc.nextInt();
    
    
    
    for(int line=1;line<=i;line++){
      
      for(int space=1; space<=i-line; space++){
        
        
        
        System.out.print(" ");
      }
      for (int colm=1;colm<=line*2-1;colm++){
        
        System.out.print(colm);
      }
      
      System.out.println();
      
      
      
    }
  }
}
