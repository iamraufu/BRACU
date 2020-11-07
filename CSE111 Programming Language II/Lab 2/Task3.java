import java.util.Scanner;
public class Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length-1;j++){
            for(int k=j+1;k<a.length;k++){
                if(a[j]<a[k]){
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}