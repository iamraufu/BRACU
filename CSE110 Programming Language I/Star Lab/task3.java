import java.util.Scanner;
public class task3{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number of rows");
  int row=sc.nextInt();
  System.out.println("Enter number of columns");
  int col=sc.nextInt();
  for(int rowCount=1;rowCount<=row;rowCount++){
    for(int colCount=1;colCount<=col;colCount++){
    System.out.print("*");
    }
    System.out.println();
  }
  }
}