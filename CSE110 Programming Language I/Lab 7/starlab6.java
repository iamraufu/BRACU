import java.util.Scanner;
public class starlab6{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int i= sc.nextInt();
    
    
    
    for(int line=1;line<=i;line++){
      
      for(int colm=1;colm<=line;colm++){
        
        
        
        System.out.print(colm);
      }
      System.out.println();
    }
  }
}

