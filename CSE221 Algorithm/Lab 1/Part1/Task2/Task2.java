import java.util.Scanner;

public class Task2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a[]=new int[5];
        int max=0,min=0,maxPosition=0,minPosition=0,temp;
        for(int i=0;i<=4;i++){
            a[i]=input.nextInt();
        }
        
        max=a[0];
        min=a[0];
        
        for(int i=0;i<=4;i++)
        {
            
            if(a[i]>max)
            {
                max=a[i];
                maxPosition=i;
            }
            
            else if (a[i]<min)
            {
                min=a[i];
                minPosition=i;
            }
        }
        
        temp=max;
        a[maxPosition]=min;
        a[minPosition]=temp;
        
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}