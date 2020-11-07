import java.util.*;
public class Task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double i,e,r,f,l,c,pi;
        pi = 3.1416;
        
        e = sc.nextDouble();
        r = sc.nextDouble();
        f = sc.nextDouble();
        l = sc.nextDouble();
        c = sc.nextDouble();
        
        i = Math.pow((Math.pow(r,2)+Math.pow(((2*pi*f*l)-(1/2*pi*f*c)),2)),.5);
        System.out.print(i);
    }
}