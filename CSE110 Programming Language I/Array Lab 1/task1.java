import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a[]=new int[3];
        int sum=0;
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.print(sum+",");
        
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        } 
    }
}