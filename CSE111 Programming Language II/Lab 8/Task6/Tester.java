public class Tester {
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);
        System.out.println("--------------------");
        
        rn = new ComplexNumber(5, 7);
        System.out.println(rn);
        
        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}
