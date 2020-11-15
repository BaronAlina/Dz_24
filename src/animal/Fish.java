package animal;

public class Fish extends Animal {
    String poroda ="Домашняя";
    void move(){
        System.out.println("Я плыву!");
    }

    public Fish() {
        this("");
        System.out.println(this.poroda);
        System.out.println(super.poroda);
        System.out.println("Отработал конструктор класса Fish");
    }

    public Fish(String s){
        super();
        System.out.println("Отработал конструктор с аргументом класса Fish");
    }
}
