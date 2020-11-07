public class Tester{
    public static void main(String [] args){
        Animal n = new Cat("cat");
        Animal d = new Dog("dog");
        System.out.println(n.getName());
        n.makeNoise();
        System.out.println(d.getName());
        d.makeNoise();
    }
}