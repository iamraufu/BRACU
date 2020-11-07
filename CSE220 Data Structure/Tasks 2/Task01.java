import java.util.Scanner;
public class Task01{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please eneter a value");
    int n=sc.nextInt();
    System.out.println(n+" factorial : "+fact(n));
  }
  public static int fact(int num){
    if(num==1){
      return 1;
    }
    else{
      return num*fact(num-1);
    }
  }
}