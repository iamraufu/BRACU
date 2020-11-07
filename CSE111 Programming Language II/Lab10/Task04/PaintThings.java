public class PaintThings{
    public static void main (String [] args){
        Paint p= new Paint(10.0);
        Sphere bigBall= new Sphere(10.0);
        Rectangle deck = new Rectangle(20.0,35.0);
        Cylinder tank = new Cylinder(10.0,30.0);
        System.out.println(p.getAmount(bigBall));
        System.out.println(p.getAmount(deck));
        System.out.println(p.getAmount(tank));
    }
}