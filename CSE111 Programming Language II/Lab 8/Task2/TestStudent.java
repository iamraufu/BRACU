//public class Student{
//    private String name = "Just a Student";  
//    private String department = "nothing";
//    public void setDepartment(String dpt){
//        this.department = dpt;
//    }
//    protected String getName(){
//        return name;
//    }
//    protected void setName(String name){
//        this.name = name;
//    }
//    public String toString(){
//        return "Name : " + name + " Department: " + department;
//    }
//}
public class TestStudent{
    public static void printName(Student s){
        System.out.println(s.toString());
    }
    public static void main(String [] args){
        printName(new BBAStudents());
        printName(new BBAStudents("Humty Dumty"));
        printName(new BBAStudents("Little Bo Peep"));    
    }
}
