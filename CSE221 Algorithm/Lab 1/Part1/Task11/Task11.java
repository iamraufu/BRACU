import java.util.Scanner;

public class Task11 
{
    public static void allDigitsOdd(int o) 
    {
        int m,a,c=0,counter=0;
        m=o;
        
        while(m>0)
        {
            m=m/10;
            counter++;
        }
        
        for(int i=counter;i>0;i--) 
        {
            a=o%10;
            if(a%2==0)
                c++;
            o=o/10;
        }
        
        if(c>0)
            System.out.println("False");
        else
            System.out.println("True");
    }
    
    public static void main(String []args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number");
        int o=input.nextInt();
        allDigitsOdd(o);
    }
}