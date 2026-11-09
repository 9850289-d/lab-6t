package ua.opnu.animals;

public class MainAnimals {
    public static void main(String[] args) {
        Animal myDog = new Dog("Рекс");
        Animal myCat = new Cat("Мурзік");

        System.out.println(myDog.getName() + " каже: " + myDog.makeSound());
        System.out.println(myCat.getName() + " каже: " + myCat.makeSound());
    }
}