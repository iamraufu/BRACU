import java.util.Scanner;
public class task6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            int max=a[i];
            int maxIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>max){
                    max=a[j];
                    maxIndex=j;
                }
            }
            int temp=a[i];
            a[i]=max;
            a[maxIndex]=temp;
        }
        for(int i=0;i<a.length;i++){
            if(a.length%2!=0){
            System.out.print((a[n]%2));
            }
            if(a.length%2==0){
            System.out.println((a[n]%2+a[n+2]%2));
            }
        }
    }
}