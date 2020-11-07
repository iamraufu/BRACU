public class Student implements StInterface{
    public String name;
    public int id;
    public String addressfield;
    Student(){}
    public Student(String k){
        addressfield=k;
    }
    public void setName(String n){
        name=n;
    }
    public void setAddress(String n){
        addressfield=n;
    }
    public void setID(int k){
        id=k;
    }
    public String getName(){
        return name;
    }   
    public int getID(){
        return id;
    }
    public String getAddress(){
        return addressfield;
    }
    public String toString(){
        return ""+getName()+"\n"+getID()+"\n"+getAddress();
    }
}
    