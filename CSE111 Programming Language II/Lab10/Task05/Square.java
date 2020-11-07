public class Square extends Rectangle{
    Square(){}
    Square(double s){
    super(s,s);
    }
    Square(double s,String c, boolean f){
    super(s,s,c,f);
    }
    public double getSide(){
        return length;
    }
    public void setSide(double k){
        super.length=k;
        super.width=k;
    }
    public void setWidth(double m){
        super.length=m;
        super.width=m;
    }
    public void setLength(double k){
        super.length=k;
        super.width=k;
    }
    public String toString(){
        return "Square";
    }
}
        