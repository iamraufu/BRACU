public class Author{
    private String name;
    private String email;
    private char gender;
    Author(String s, String v , char g){
        name=s;
        email=v;
        gender=g;
    }
    public void setEmail(String n){
        email=n;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return ""+getName()+" "+"("+getGender()+")"+" at "+getEmail()+"";
    }
}
    
        