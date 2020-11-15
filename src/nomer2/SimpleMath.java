package nomer2;

public class SimpleMath {
    private int a;
    private int b;
    private double forsin;
    private double forcos;

    public int sum(int a, int b){
        return a + b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int com(int a, int b){
        return a*b;
    }
    public double sin(double forsin){
        return Math.sin(Math.toRadians(forsin));
    }
    public double cos(double forcos){
        return Math.cos(Math.toRadians(forcos));
    }
}
