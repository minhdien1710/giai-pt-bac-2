public class Account {
    private float a, b, c;

    public Account() {
    }

    public Account(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public double getDelta(){
        return  (b*b - 4*a*c);
    }
    public double getR1(){
        return (-b-(Math.sqrt(getDelta())))/(2*a);
    }
    public double getR2(){
        return (-b + (Math.sqrt(getDelta())))/(2*a);
    }
}
