import java.util.Scanner;
public class P2task4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        try{
        a[5]=99;
        }
        catch(Exception e){
          System.out.println("ArrayIndexOutOfBoundsException");
        }
        try{
        x=n/0;
        }
        catch(Exception e){
          System.out.println("ArithmeticException");
        }
        try{
          n=sc.nextInt();
        }
        catch(Exception e){
          System.out.println("InputMismatchException");
        }
    }
}
