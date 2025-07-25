package Interface;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        System.out.println(Dog.Max_Age);
        System.out.println(Animal.Max_Age);
        Animal.info();
        dog.run();
        cat.run();
        dog.sleep();
        cat.sleep();
    }
}
