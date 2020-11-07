import java.util.Scanner;

public class Task8 
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Dimension of matrix");
        int dimension = input.nextInt();
        int a[]=new int[dimension];
        int b[]=new int[dimension];
        int c[]=new int[dimension];
        System.out.println("Enter values for first matrix");
        
        for (int i=0;i<a.length;i++) 
        {
            a[i] = input.nextInt();
        }
        
        System.out.println("Enter values for second matrix");
        
        for (int i=0;i<b.length;i++) 
        {
            b[i] = input.nextInt();
        }
        
        for (int i=0;i<c.length;i++) 
        {
            c[i]=5*a[i]-b[i];
            System.out.println(c[i]);
        }
    }
}