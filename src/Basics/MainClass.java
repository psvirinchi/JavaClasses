package Basics;

public class MainClass {
    public static void main(String[] args){
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal cow = new Animal("cow");
        Animal horse = new Animal("horse");
        dog.makeAnimalSound();
        cat.makeAnimalSound();
        cow.makeAnimalSound();
        horse.makeAnimalSound();
    }
}
