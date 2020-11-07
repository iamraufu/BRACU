import java.util.Scanner;

public class Task7 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0;i<10;i++)
        {
            a[i]=input.nextInt();
        }
        
        System.out.println("enter a number");
        int num=input.nextInt();
        
        for(int i=1;i<=a[num];i++)
        {
            System.out.println("*");
        }
    }
}