/**
 * Created by tian on 16-6-3.
 */
public class ConcreteObserver extends Observe {
    private String name;
    private String observerState;

    public ConcreteObserver() {

    }

    public ConcreteSubject getConcreteObserver() {
        return concreteObserver;
    }

    public void setConcreteObserver(ConcreteSubject concreteObserver) {
        this.concreteObserver = concreteObserver;
    }

    private ConcreteSubject concreteObserver;
    public ConcreteObserver(ConcreteSubject concreteObserver, String name){
        this.concreteObserver = concreteObserver;
        this.name = name;
    }

    @Override
    protected void update() {
        observerState = concreteObserver.getSubjectsState();
        System.out.println(observerState+"  "+name);
    }
}
