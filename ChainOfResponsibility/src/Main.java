/**
 * Created by tian on 16-6-7.
 * 使多个对象都由机会处理请求，从而避免请求的发送者
 * 和接受者之间的耦合关系，将这个对象连成一条链，并
 * 沿着这条链传递该请求，直到有一个对象处理它为止。
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        Handler h3 = new Handler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        int a[] = new int[]{
                1, 13, 24, 12, 4, 26
        };
        for (int i = 0; i < a.length; i++) {
            h1.handleRequest(a[i]);
        }
    }
}
