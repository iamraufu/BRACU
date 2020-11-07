import java.util.Scanner;
public class starlab16{
  public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter line");
    
    
    int size= sc.nextInt();
    int sp=1;
    
    for(int row=1;row<=size;row++){
      
      System.out.print("*");
      
      if(row>1 && row!=size){
        
        for(int i=0;i<sp;i++)
          System.out.print(" ");
        
        sp++;
        System.out.print("*");
      }
      
      else{
        for(int col=1;col<=row;col++ ){
          
          System.out.print("*");
        }
      }
      System.out.println();
      
      
    }
  }
}



