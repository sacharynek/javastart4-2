package triangle;

public class Triangle  {

    private int a, b, c;

    public Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Triangle(int a, int b, int c){
        if(a < 1 || b < 1 || c < 1){
            throw new IllegalArgumentException("");
        }
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
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
