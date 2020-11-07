import java.util.Scanner;

public class Task5 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int a[]=new int[10];
        int num=0;
        
        for(int i=0;i<15;i++)
        {
            num=input.nextInt();
            a[num]++;
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println(i+" was found "+a[i]+" times");
        }
    }
}  