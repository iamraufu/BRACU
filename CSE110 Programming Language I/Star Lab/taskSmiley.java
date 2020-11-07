import java.util.Scanner;
public class taskSmiley{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    for(int rowCount=1;rowCount<=n;rowCount++){
      for(int space=1; space<=n-rowCount;space++){
        System.out.print(" ");
      }
      for(int colCount=1;colCount<=rowCount;colCount++){
        if(rowCount%2==0){
        System.out.print(":P");
        } else{
        System.out.print(":)");
        }
      }
      System.out.println();
    }
  }
}