public class Sphere extends Shape{
    public double radius;
    Sphere(){
    super("Sphere");
    }
    Sphere(double r){
        super("Sphere");
        radius=r;
    }
    public double area(){
        return (4*Math.PI*(radius*radius));
    }
    public String toString(){
        return super.toString();
    }
}