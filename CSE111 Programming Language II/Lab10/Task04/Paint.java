public class Paint{
    public double coverage;
    Paint(){}
    Paint(double k){
        coverage=k;
    }
    double getAmount(Shape s){
        double k=(s.area()/coverage);
        return k;
    }
}