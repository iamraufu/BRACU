import java.util.Scanner;
public class taskk1{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    int counter=1;
    for(counter=1;counter<=n;counter++){
     sum=sum+counter;
    System.out.println(sum);
    }
  }
}