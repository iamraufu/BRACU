import java.util.Scanner;

public class Task1 
{
    public static boolean firstLast6(int array[])
    {
        if(array[0] == 6 || array[array.length-1]==6)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        
        for(int i=0;i<array.length;i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(firstLast6(array));
    }
}