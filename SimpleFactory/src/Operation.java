/**
 * Created by tian on 16-5-28.
 */
public abstract class Operation {
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    private double numberA = 0;
    private double numberB = 0;

    public abstract double getResult();
}

class Add extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}

class Sub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}