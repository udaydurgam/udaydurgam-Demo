class Animal {
    String name;

    public Animal(String name) {
        this.name = name;

    }

    public void eat() {
        System.out.println(name + "is eating.");

    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void Bark() {
        System.out.println(name + "Woof! Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + "Meow!, Meow!");
    }
}

// Main CLass

class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        myDog.eat();
        myDog.Bark();
        myDog.Bark();

        myCat.eat();
        myCat.meow();
        myCat.sleep();
    }
}