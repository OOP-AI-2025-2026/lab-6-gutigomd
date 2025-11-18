package task1;

// Абстрактний клас
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Абстрактний метод
    abstract String makeSound();
}

// Підклас Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав-гав!";
    }
}

// Підклас Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Мяу!";
    }
}

// Головний клас для перевірки
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Рекс");
        Animal cat = new Cat("Мурчик");

        System.out.println(dog.getName() + " каже: " + dog.makeSound());
        System.out.println(cat.getName() + " каже: " + cat.makeSound());
    }
}
