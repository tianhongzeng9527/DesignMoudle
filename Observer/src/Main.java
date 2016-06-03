/**
 * Created by tian on 16-6-3.
 * 观察者模式定义了一种一对多的依赖关系，
 * 让多个观察者对象同时监听某一个主题对象，
 * 这个主题对象在状态发生改变时，会通知所有观察者对象，
 * 使它们能够自动更新自己。
 */
public class Main {
    public static void main(String[] args){
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"x"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"z"));
        concreteSubject.setSubjectsState("xyz");
        concreteSubject.notity();
    }
}
