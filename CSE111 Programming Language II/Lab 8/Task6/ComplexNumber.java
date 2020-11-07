public class ComplexNumber extends RealNumber{
    private double imaginaryvalue=1.0;
    ComplexNumber(){
    super(1.0);
        
    }
    ComplexNumber(int m , int k){
    super(m);
    imaginaryvalue=k;
    }
    public String toString() {
        return "RealPart: "+getRealValue()+"\n"+"Imaginary part: "+imaginaryvalue;
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
    public void check(){
        super.ping();
        ping();
        System.out.println("Check ended");
    }
}
    