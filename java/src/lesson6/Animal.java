package lesson6;

public class Animal {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public void run(int m){
     System.out.println(name+" пробежал "+m+"м");
 }

 public void swim(int m){
     System.out.println(name+" проплыл "+m+"м");
 }

}
