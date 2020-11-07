import java.util.Scanner;
public class task6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ten Numbers");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--){
            if(a[i]%2!=0){
                System.out.println(a[i]);
                break;
            }
        }
    }
}