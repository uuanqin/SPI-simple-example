package top.uuanqin;

public class Singleton {

    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("生成了一个实例。");

    }

    // 容易有竞争问题，如果两个线程 getInstance，可能都误以为都是NULL。所以添加synchronized
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}