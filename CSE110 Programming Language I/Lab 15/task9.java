import java.util.Scanner;
public class task9{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();  
        }
        int n= sc.nextInt();
        int i;
        for(i=0;i<a.length;i++){
            if(n==a[i]){
            System.out.println("Yes");
           break;
            }
            
        }
        if(i == a.length){
            System.out.println("No");
        }
    }
}