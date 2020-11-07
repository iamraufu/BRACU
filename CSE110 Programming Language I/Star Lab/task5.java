import java.util.Scanner;
public class task5{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number");
  int n=sc.nextInt();
  for(int rowCount=1;rowCount<=n;rowCount++){
    for(int colCount=1;colCount<=rowCount;colCount++){
    System.out.print("*");
    }
    System.out.println();
  }
  }
}