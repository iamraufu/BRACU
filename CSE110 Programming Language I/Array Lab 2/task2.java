import java.util.Scanner;
public class task2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int maxIndex=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                maxIndex=i;
            }
        }
        System.out.println("Largest number "+max+" was found at location "+maxIndex);
    }
}