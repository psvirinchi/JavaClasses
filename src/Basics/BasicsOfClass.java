package Basics;

public class BasicsOfClass {
    public static void main(String[] args) {
        Person person = new Person();
        sayHello(person);
        Person person2 = new Person("Viru", "Pala", 27, "Amazon");
        sayHello(person2);
    }

    private static void sayHello(Person person) {
        System.out.print("Hello my dear, " + person.getFirstName());
        if (person.getLastName() != null) {
            System.out.print(" " + person.getLastName());
        }
        if (person.getAge() > 0) {
            System.out.print(" , Age: " + person.getAge());
        }
        if (person.getCompany() != null) {
            System.out.print(" , Company: " + person.getCompany());
        }
        System.out.println();
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String company;

    public Person() {
        System.out.println("I am in default constructor");
    }

    public Person(String firstName, String lastName, int age, String company) {
        System.out.println("I am in constructor with some arguments");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }
}

