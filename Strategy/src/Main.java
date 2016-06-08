/**
 * Created by tian on 16-6-8.
 * 它定义了算法家族，分别封装起来，让它们之间可以
 * 互相替换，此模式让算法的变化不会影响到使用算法的家族
 */
public class Main {
    public static void main(String[] args){
        System.out.println();
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
