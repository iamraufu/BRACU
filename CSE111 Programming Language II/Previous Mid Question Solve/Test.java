public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Alfa Romeo");
        Car c3 = new Car("Mercedes-Benz","SLR McLaren 999");
        c1.start();
        System.out.println("---------------------------");
        c2.start();
        System.out.println("---------------------------");
        c3.start();
    }
}