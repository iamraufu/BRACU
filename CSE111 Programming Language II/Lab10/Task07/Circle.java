public class Circle implements GeometricObject{
    protected double radius = 1.0;
    Circle(){}
    Circle(double r){
        radius=r;
    }
    public double getPerimeter(){
        double peri=(2*Math.PI*radius);
        return peri;
    }
    public double getArea(){
        double area=(Math.PI*Math.pow(radius,2));
        return area;
    }
}
    