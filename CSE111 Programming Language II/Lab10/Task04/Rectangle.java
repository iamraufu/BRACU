public class Rectangle extends Shape{
    public double length , width ;
    Rectangle(){
        super("Rectangle");
    }
    Rectangle(double l , double w){
        super("Rectangle");
        length=l;
        width=w;
    }
    public double area(){
        double area= length*width;
        return area;
    }
    public String toString(){
        return super.toString();
    }
}