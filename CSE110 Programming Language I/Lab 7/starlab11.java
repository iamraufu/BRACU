import java.util.Scanner;
public class starlab11{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int i= sc.nextInt();
    int h= i;
    
  
    
    for(int line=1;line<=i;line++){
      
      for(int space=(line-1); space<=(i-line); space--){
        
        
        
        System.out.print(" ");
      }
      for (int colm=1;colm<=2*line-1;colm++){
        
        System.out.print(colm);
      }
      
      System.out.println();
      
      
      
    }
  }
}
