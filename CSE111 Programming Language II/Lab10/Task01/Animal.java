public class Animal{
    private String name="Animal";
    Animal(){}
    Animal(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    public void makeNoise(){
        System.out.println("Animal Sound");
    }
}