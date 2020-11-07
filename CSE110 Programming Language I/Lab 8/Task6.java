import java.util.Scanner;
public class Task6{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int [] n = new int [15];
        int [] a = new int [10];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
            if(n[i]<0 ||n[i]>9){
                i--;
            }
            a[n[i]]++;
        }
        for(int j=0;j<a.length;j++){
            System.out.println(j+ " has been entered "+a[j]+" times.");
        }
    }
}