/**
 * Created by tian on 16-6-4.
 * 建造者模式，将一个复杂的对象的构建和它的表示分离，
 * 使得同样的构建过程中可以创建不同的表示。
 * 如果我们使用了建造者模式，那么用户就只需要指定需要建造
 * 的类型就可以得到他们，而具体的建造细节吧不用知道
 */
public class Main {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();
    }
}
