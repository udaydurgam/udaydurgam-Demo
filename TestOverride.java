class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // This method overrides the makeSound method in the superclass (Animal)
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Output: Some generic sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark! Bark!

        // Using polymorphism to call the overridden method
        Animal polymorphicAnimal = new Dog();
        polymorphicAnimal.makeSound(); // Output: Bark! Bark!
    }
}
