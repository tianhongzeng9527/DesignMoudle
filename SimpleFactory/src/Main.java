/*
 * 简单工厂模式的最大有点在于工厂类中包含了
 * 必要的逻辑判断，根据客户端的选择条件动态实
 * 例化相关的类，对于客户端来说，
 * 去除了与具体产品的依赖
 *
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Operation operation = factory.createOperate("+");
        operation.setNumberA(10);
        operation.setNumberB(5);
        System.out.println(operation.getResult());
    }
}