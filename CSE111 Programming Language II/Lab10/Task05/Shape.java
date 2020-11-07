public abstract class Shape{
    protected String color;
    protected boolean filled;
    Shape(){}
    Shape(String c, boolean p){
    color=c;
    filled=p;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String r){
        color=r;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean m){
        filled=m;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
    
        