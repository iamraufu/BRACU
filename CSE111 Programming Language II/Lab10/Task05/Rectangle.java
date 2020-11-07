public class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){
    }
    Rectangle(double w , double l){
    width=w;
    length=l;
    }
    Rectangle(double w,double l, String c, boolean k){
    super(c,k);
    width=w;
    length=l;    
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width=w;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length=l;
    }
    public double getArea(){
        double area=(length*width);
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(length+width);
        return width;
    }
    public String toString(){
        return "Rectangle";
    }
}
    