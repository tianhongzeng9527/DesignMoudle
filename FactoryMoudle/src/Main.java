/**
 * Created by tian on 16-5-29.
 * <p>
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个对象。工厂方法使一个类的实例化延迟到其子类
 * 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，
 * 也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。想要增加新功能，原来是修改工厂类，
 * 现在是修改客户端。
 */
public class Main {
    public static void main(String[] args) {
        //简单工厂模式
        LeiFeng studentA = SimpleFactory.CreateLeiFeng("xuesehng");
        LeiFeng zhiyuanzhe = SimpleFactory.CreateLeiFeng("zhiyuanzhe");
        //工厂模式
        Factory factory = new UnderGraduateFactory();
        LeiFeng xuesheng = factory.CreateLeiFeng();
    }
}
