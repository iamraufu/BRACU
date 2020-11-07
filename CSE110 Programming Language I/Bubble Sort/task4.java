import java.util.Scanner;
public class task4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}