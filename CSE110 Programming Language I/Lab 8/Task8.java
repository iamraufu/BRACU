import java.util.Scanner;
public class Task8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];  
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            for(int j = 0; j < i; j++) {
                if(array[i] != array[j]) {
                    continue;    
                }
                else {
                    System.out.println("Enter a different number");
                    break;     
                }
            }
        }
    }
}
