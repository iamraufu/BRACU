import java.util.Scanner;
public class bhai{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int n= sc.nextInt();
    int sum=0;
    int counter=1;
    int k=1;
    for(counter=1;counter<=n;counter++){
     sum=(sum+(2+k));
    System.out.println(sum);
   
    }
  }
}