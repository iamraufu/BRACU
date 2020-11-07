import java.util.Scanner;

public class Task10
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter position to be rotated");
        int p = input.nextInt();
        int [] a = {1,4,8,16,25,36,49,64,81,100};
        int[]b=new int[10];
        
        for(int i=0;i<10;i++)
        {
             b[i]=a[(i+p)%10];
        }
        
        System.out.println("Left Rotated");
        
        for(int i=0;i<10;i++){
        System.out.print(b[i] + " ");
        }
        
        for(int i=0;i<10;i++)
        {
             b[i]=a[(i-p+10)%10];
        }
        
        System.out.println("\nRight Rotated");
        
        for(int i=0;i<10;i++){
        System.out.print(b[i] + " ");
        }
    }
}