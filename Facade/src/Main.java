/**
 * Created by tian on 16-6-6.
 * 为子系统中的一组接口提供一个
 * 一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用。
 */
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.memthodA();
    }
}
