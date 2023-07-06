package Entidades;

public class Raiz {

    private int a;
    private int b;
    private int c;

    public Raiz() {
    }

    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Raiz{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}
