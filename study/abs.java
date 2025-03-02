abstract class Animal {
  // Abstract method (does not have a body)
  abstract void makeSound();

  // Regular method
  void sleep() {
    System.out.println("Sleeping");
  }
}
class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Dog barks");
  }
}

public class abs {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.makeSound();
    dog.sleep(); }
}