public class Cylinder extends Shape{
    public double radius , height ;
    Cylinder(){
        super ("Cylinder");
    }
    Cylinder(double r , double k){
        super ("Cylinder");
        radius=r;
        height=k;
    }
    public double area(){
        return (Math.PI*Math.pow(radius,2)*height);
    }
    public String toString(){
        return super.toString();
    }
}
     