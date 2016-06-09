/**
 * Created by tian on 16-6-9.
 *  * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像改变了其类
 *  状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂的时候，把
 *  状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 *
 *  我怎么感觉类似责任连模式，都是把它穿起来，责任连是每处理一个都是从头，
 *  而这个是走到哪里就是哪里了，然后接着处理。
 */
public class Main {
    public static void main(String[] args){
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
        c.request();

    }
}
