package animal;

public class Cat extends Animal {
    @Override //аннотация
    void move() {
        System.out.println("Я бегу!");
    }
}
