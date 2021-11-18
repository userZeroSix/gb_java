package lesson6;

public class Cat extends Animal{

    public void run(int m){

        if(m > 200){
            System.out.println("LIMIT");
        } else
            System.out.println(name+" пробежал "+m+"м");
    }


    public void swim(int m){

        if (m > 0){
            System.out.println("the cat can't swim");
        } else
            System.out.println(name+" проплыл "+m+"м");

    }
}
