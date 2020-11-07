import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        QuadEqn q1 = new QuadEqn();
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("x"+a+"+"+"x"+b+"+"+"x"+c);
        
        System.out.println(q1.root());
    }
}