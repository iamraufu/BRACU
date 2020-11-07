import java.util.*;
class Task4{
public static void convert(int num) {
    if (num>0) {
        convert(num/2);
        System.out.print(num%2 + " ");
    }
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Task4 a=new Task4();
a.convert(n);
}
}
