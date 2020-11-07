public class Animal {

  //Name of the Animal
  private String sound = "Animal Sound";

  //Default Constructor
  public Animal(){
  }

  //Overloaded Constructor
  Animal(String _sound){
    this.sound = _sound;
  }

  //Return sound
  public String makeSound(){
    return sound;
  }
}