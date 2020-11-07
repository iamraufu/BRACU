public class Circle extends Shape{
    private double radius;
    Circle(){}
    Circle(double r){
    radius=r;
    }
    Circle(double r, String c, boolean f){
        super(c,f);
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius=r;
    }
    public double getArea(){
        double area=(Math.PI*Math.pow(radius,2));
        return area;
    }
    public double getPerimeter(){
        double peri=(2*Math.PI*radius);
        return peri;
    }
    public String toString(){
        return "Circle";
    }
}