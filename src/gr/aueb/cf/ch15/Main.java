package gr.aueb.cf.ch15;

public class Main {
    public static void main (String[] args) {
        Dog myDog = new Dog ("Buddy", 5);
        Cat myCat = new Cat (4, "Fluffy");

        myDog.speak();
        myDog.toString();
        myCat.speak();
        myCat.toString();

        System.out.println(myCat);
        System.out.println(myDog);
    }

        public static void doSpeak(Animal animal){
            animal.speak();
        }
}
