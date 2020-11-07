import java.util.Scanner;

public class Task9 
{
    public static void Display(int []a, int n) 
    {
        for(int i=0;i<n;i++) 
        {
            System.out.println(a[i]);
        }
    }
    
    public static void Square(int []a, int n) 
    {
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]*a[i];
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter Ten Numbers");
        for(int i=0;i<10;i++) {
            a[i]=input.nextInt();
        }
        Display(a,10);
        Square(a,10);
        Display(a,10);
    }
}