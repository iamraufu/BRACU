public class Tester{
    public static void main(String [] args){
        Employee e = new Employee("kamal",200.00,2011,"1283930");
        Employee j = new Employee("JOBBAR",200.00,2011,"124638");
        e.printDetail();
        j.printDetail();
        e.equals(j);
        
    }
}