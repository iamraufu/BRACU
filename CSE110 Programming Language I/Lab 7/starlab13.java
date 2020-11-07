import java.util.Scanner;
public class starlab13{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int line= sc.nextInt();
    int count=line-1;
    
    
    for(int k=1;k<=line;k++){
      
      for(int i=1;i<=count;i++){
        
        System.out.print(" ");
      }
    
      count--;
      for(int i=1;i<=2*k-1;i++){
        
        System.out.print(i);
      }
      
      System.out.println();
    }
    
    count=1;
    
    for(int k=1;k<=line-1;k++){
      for(int i=1;i<=count;i++)
        
        System.out.print(" ");
        
        
        
        count++;
      
      for(int i=1;i<=2*(line-k)-1;i++)
        
        System.out.print(i);
      
      System.out.println();
      
    }
  }
}

