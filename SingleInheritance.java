 SINGLE INHERITANCE:
Single inheritance is the most basic type of inheritance in Java, where a class inherits from only one parent class.
It establishes a straightforward "is-a" or parent-child relationship, for example, a Car is a Vehicle.
This relationship is created using the extends keyword, where a subclass or child class inherits 
the properties and behaviors (methods and fields) of a single superclass or parent class. 
This mechanism promotes strong code reusability by allowing the child class to use or
override existing code from the parent, reducing duplication. It also enables method overriding,
a key feature of polymorphism, where the subclass provides its own specific implementation of an inherited method.
While it simplifies the class hierarchy and makes code cleaner, its limitation is that a class can only
inherit from a single parent, which restricts design flexibility in some cases.

CODE:

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

OUTPUT:
Animals make sounds
Dog barks
