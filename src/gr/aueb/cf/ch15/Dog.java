package gr.aueb.cf.ch15;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super (age, name);

    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
            return "Dog [name = " + getName() + ", age = " + getAge() + "]";
        }
}
