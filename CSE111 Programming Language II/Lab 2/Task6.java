import java.util.*;
public class Task6{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        double y = 0;
        int n = sc.nextInt();
        for (double i=0; i<= n; i++){
            if (i%2 == 0){
                y = y - Math.pow(i,2);
            } else {
                y = y + Math.pow(i,2);
            }
        }
        System.out.println(y);
        
    }
}