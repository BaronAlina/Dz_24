package animal;

public abstract class Animal {
    String poroda = "Дикий";
    String color;

    public  Animal(){
        System.out.println("Отработал конструктор класса Animal");
    }
    abstract void move();
}
