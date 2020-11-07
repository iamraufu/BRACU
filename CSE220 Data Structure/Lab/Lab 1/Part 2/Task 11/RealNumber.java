public class RealNumber {
    private double realValue;
    public double getRealValue() {
        return realValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public RealNumber() {
        this(0);
    }
    public RealNumber(double r) {
        setRealValue(r);
    }
    public String toString() {
        return "RealPart: "+getRealValue();
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}
