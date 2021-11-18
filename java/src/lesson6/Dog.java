package lesson6;

public class Dog extends Animal {

    public void run(int m) {

        if (m > 500) {
            System.out.println("LIMIT");
        } else
            System.out.println(name + " пробежал " + m + "м");
    }

    public void swim(int m) {

        if (m > 10) {
            System.out.println("LIMIT");
        } else
            System.out.println(name+" проплыл "+m+"м");

    }
}
