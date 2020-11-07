import java.util.Scanner;

public class Task3 
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 Numbers");
        
        for(int i=0;i<5;i++) 
        {
            a[i]=input.nextInt();
        }
        
        int temp;
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++) 
            {
                if(a[j+1]>a[j]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        
        for(int i=0;i<5;i++) 
        {
            if(a[i]%2==0) {
                System.out.println(a[i]);
            }
        }
    }
}      