import java.util.Scanner;
public class P2task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double h, w, a;
    Square s1 = new Square();
    s1.setHeight(3);
    s1.setWidth(4);
    h = s1.getHeight();
    w = s1.getWidth();
    a = s1.getArea();
    System.out.println("Height = "+ h);
    System.out.println("Width = "+ w);
    System.out.println("Area = "+ a);
  }
}
