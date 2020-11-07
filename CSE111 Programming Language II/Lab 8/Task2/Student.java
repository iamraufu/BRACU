public class Student{
    private String name = "Just a Student";  
    private String department = "nothing";
    public void setDepartment(String dpt){
        this.department = dpt;
    }
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Name : " + name + " Department: " + department;
    }
}