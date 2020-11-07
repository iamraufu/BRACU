public class Dog{
    private String color="Black";
    public Dog(){
        
    }
    public Dog(String c){
        color=c;
    }
    public void bark(Dog c){
        if(color==dog.color){
            System.out.println(color+" is barking");
        }
    }
    public void changeColor(Dog c){
        color="Brown";
    }
}