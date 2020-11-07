import java.util.Scanner;

public class Task4 
{
    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        int a[]=new int[10];
        a[0]= input.nextInt();
        
        outer:
            
            for(int i=1;i<a.length;i++)
        {
            int n=input.nextInt();
            
            for(int j=0;j<i;j++)
            {
                if(n==a[j])
                {
                    System.out.println(n+" is already in among the entered numbers, please enter a new number.");
                    i--;
                    continue outer ;
                }
            }
            
            a[i]=n;
        }
    }
}             