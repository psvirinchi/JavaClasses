package Basics;

public class Animal {
    private String typeOfAnimal;

    public Animal(String typeOfAnimal){
        this.typeOfAnimal = typeOfAnimal;
    }

    public void makeAnimalSound(){
        if (typeOfAnimal.equals("dog")){
            System.out.println(typeOfAnimal + " says BOW");
        }
        else if (typeOfAnimal.equals("cat")){
            System.out.println(typeOfAnimal + " says MEOW");
        }
        else if (typeOfAnimal.equals("cow")){
            System.out.println(typeOfAnimal + " says MOO");
        }
        else {
            System.out.println("Unknown animal sound for " + typeOfAnimal);
        }
    }
}
