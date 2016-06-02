/**
 * Created by tian on 16-6-2.
 * 抽象工厂模式，提供一个创建一系列
 * 相关或相互依赖对象的接口，而无需指定它们具体的类
 * 好处
 *１易于交换产品系列，由于具体工厂类，在一个应用中只需要在初始化的时候出现一次，这就使得
 * 改变一个具体应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。
 * 它让具体的创建实例过程和客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名
 * 也被具体工厂的实现分离，不会出现在客户端中。
 */
public class Main {
    public static void main(String[] args){
        User user = new User();
//        IFactory factory = new SqlServerFactory();
//        IUer iUer = factory.CreateUser();
//        iUer.insert(user);
//        iUer.getUser(1);
        Department department = new Department();
        IFactory factory = new AccessFactory();
        IUer iUer = factory.CreateUser();
        iUer.getUser(1);
        IDepartment iDepartment = factory.CreatDepartment();
        iDepartment.getDepartment(1);
    }
}
