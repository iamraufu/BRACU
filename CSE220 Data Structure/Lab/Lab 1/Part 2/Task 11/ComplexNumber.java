public class ComplexNumber extends RealNumber{
  public double value;
  public ComplexNumber(){
    super.setRealValue(1.0);
    value=1.0;
  }
  public ComplexNumber(double a,double b){
    super.setRealValue(a);
    value=b;
  }
  public String toString(){
    return super.toString()+"\nImaginaryPart:"+value;
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking ended");
  }
}