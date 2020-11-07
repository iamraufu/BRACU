import java.util.Scanner;
public class task8{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    for(int rowCount=1;rowCount<=n;rowCount++){
      for(int space=1; space<=n-rowCount;space++){
        System.out.print(" ");
      }
      for(int colCount=1;colCount<=rowCount;colCount++){
        System.out.print(colCount);
      }
      System.out.println();
    }
  }
}