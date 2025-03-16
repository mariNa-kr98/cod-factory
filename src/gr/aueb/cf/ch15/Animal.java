package gr.aueb.cf.ch15;

public class Animal {

    private int age;
    private String name;

    public Animal(){

    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("I am an animal");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
