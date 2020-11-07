public class Midterm {
    public static void main (String[] args){
        Dog scooby = new Dog();
        Dog odie = new Dog("Red");
        Dog goofy = new Dog("Blue");
        scooby.bark();
        odie.bark();
        goofy.bark();
        scooby.changeColor("Brown");
        scooby.bark();
    }
}