import java.util.Scanner;

public class Task10 
{
    public static void Season(int month,int day) 
    {
        if(month==12||month==1||month==2||month==3)
        {
            if(month==12 && day<16)
                System.out.println ("Fall");
            if(month==3 && day>15)
                System.out.println("Spring");
            System.out.println("Winter");
        }
        
        else if(month>=3&&month<=6)
        {
            if(month==3&&day<16)
                System.out.println("Winter");
            if(month==6&&day>15)
                System.out.println("Summer");
            System.out.println("Spring");
        }
        
        else if(month>=6&&month<=9)
        {
            if(month==6&&day<16)
                System.out.println("Spring");
            if(month==9&&day>15)
                System.out.println("Fall");
            System.out.println("Summer");
        }
        
        else if(month>=9&&month<=12)
        {
            if(month==9&&day<16)
                System.out.println("Summer");
            if(month==12&&day>15)
                System.out.println("Spring");
            System.out.println("Fall");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month Number");
        int month=input.nextInt();
        System.out.println("Enter Day");
        int day=input.nextInt();
        Season(month,day);
    }
}