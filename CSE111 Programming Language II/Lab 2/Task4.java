import java.util.Scanner;
public class Task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int [5];
        
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            for (int j =0; j < i;j++){
                if (a[i] == a[j]){
                    System.out.print("You have entered duplicate number please enter another number");
                    i--;
                    continue;
                }
            }
        }
        for (int k=0;k<5;k++){
            System.out.print(a[k]+" ");
        }
        
    }
}