import java.util.Scanner;
public class MainMethod
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        double c=sc.nextDouble();
        Point p1 = new Circle(c);
        double circleArea=p1.space();
        System.out.println(circleArea);
        System.out.println("Enter radius of Sphere: ");
        double s=sc.nextDouble();
        Point p2 = new Sphere(s);
        double sphereArea=p2.space();
        System.out.println(sphereArea);
    }
}