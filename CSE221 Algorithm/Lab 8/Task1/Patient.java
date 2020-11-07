public class Patient{
    public String name;
    public int age;
    public String blood;
    public int id;
    
    public Patient (String n , int a , String b , int i){
        name = n;
        age = a;
        blood = b;
        id = i;
    }
    
    public String toString(){
        return "ID:"+id+"\nName: " + name +"\nAge: "+age+"\nBlood: "+blood+"\n---" ;
    }
    
}