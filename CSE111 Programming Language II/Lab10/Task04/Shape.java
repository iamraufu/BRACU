public abstract class Shape{
    public String shapeName;
    Shape(){}
    Shape(String k){
    shapeName=k;
    }
    public abstract double area();
    public String toString(){
        return shapeName;
    }
}