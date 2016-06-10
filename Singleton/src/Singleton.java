/**
 * Created by tian on 16-6-10.
 */
//懒汉式单例类.在第一次调用的时候实例化自己,多线程的时候会生成多个实例，不适于多线程
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    //    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//            return singleton;
//        }
//        return singleton;
//    }
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//            return singleton;
//        }
//        return singleton;
//    }

//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                    return singleton;
//                }
//            }
//        }
//        return singleton;
//    }

    private static class LazyHolder{
        public static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return LazyHolder.singleton;
    }
}

//饿汉单例，自己已经初始化了，所以是线程安全的。
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return singleton;
//    }
//}
