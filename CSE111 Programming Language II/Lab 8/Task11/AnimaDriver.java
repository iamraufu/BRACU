public class AnimaDriver{

  public static void printSound(Animal a){
    System.out.println(a.makeSound());
  }

  public static void main(String [] args){
    Dog d1 = new Dog("bark");
    Cat c1 = new Cat("meow");
    Animal a1 = new Animal("Animal do not make sound");
    printSound(a1);
    printSound(c1);
    printSound(d1);
  }
}
