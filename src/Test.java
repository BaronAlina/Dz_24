

public abstract class Test {
    public abstract void move();
}
class Fish extends Test{
    @Override
    public void move() {
        System.out.println("1");
    }
}
class Bird extends Test{
    @Override
    public void move() {
        System.out.println("2");
    }
}
class Cat extends Test{
    @Override
    public void move() {
        System.out.println("3");
    }
}
