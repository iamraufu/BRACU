public class Employee extends Person{
    private double salary;
    private int year;
    private String insurance;
    Employee(String n , double d , int y , String i){
        super(n);
        salary=d;
        year=y;
        insurance=i;
    }
    public double getSalary(){
        return salary;
    }
    public int getYear(){
        return year;
    }
    public String getInsurance(){
        return insurance;
    }
    public void printDetail(){
        System.out.println(getName()+" "+getSalary()+" "+getYear()+" "+getInsurance());
    }
    public void equals(Employee p){
        if(insurance.equals(p.insurance)){
            System.out.println("Same person");
        }
        else{
            System.out.println("Not Same person");
        }
    }
    
}

       