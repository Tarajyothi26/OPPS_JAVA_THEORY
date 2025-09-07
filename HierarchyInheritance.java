HIERARCHICAL INHERITANCE
Hierarchical inheritance is a type of inheritance in Java where a single parent class 
is inherited by multiple child classes. In this structure, also known as one-to-many
inheritance, a common parent or base class serves as the foundation for several specialized 
subclasses, creating a tree-like hierarchy. Each child class inherits the common properties 
and methods of the parent, promoting code reusability and providing a consistent base for all
the subclasses. However, each child class can also define its own unique attributes and methods, 
allowing it to specialize and differentiate itself from its siblings. This structure is useful for
organizing related but distinct classes that share a core set of functionality, such as a Vehicle
class with child classes like Car, Bike, and Truck. 

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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.meow();
    }
}
OUTPUT:
Animals make sounds
Dog barks
Animals make sounds
Cat meows
