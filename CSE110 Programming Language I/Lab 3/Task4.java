import java.util.Scanner;
public class Task4{
  public static void main(String [] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter radius");
    double rad= sc.nextInt();
    double circumference = 2*Math.PI*rad; 
      double area=Math.PI*rad*rad ;
    System.out.println(circumference);
    System.out.println(area);
    }
}