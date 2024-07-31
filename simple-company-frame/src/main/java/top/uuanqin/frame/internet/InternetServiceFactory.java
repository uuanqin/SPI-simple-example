package top.uuanqin.frame.internet;



import top.uuanqin.InternetService;
import top.uuanqin.frame.SpiLoader;

/**
 * 互联网连接工厂（用于获取互联网连接服务对象）
 *
 * 互联网连接服务对象是可以复用的，没必要每次执行连接操作前都创建一个新的对象。所以我们可以使用设计模式中的 工厂模式 + 单例模式 来简化创建和获取互联网连接服务对象的操作
 */
public class InternetServiceFactory {

    // 使用静态代码块，在工厂首次加载时，就会调用 SpiLoader 的 load 方法加载序列化器接口的所有实现类，之后就可以通过调用 getInstance 方法获取指定的实现类对象了。

    static {
        SpiLoader.load(InternetService.class);
    }

    /**
     * 默认连接对象
     */
    private static final InternetService DEFAULT_SERIALIZER = new LocalConnection();

    /**
     * 获取实例
     *
     * @param key
     * @return
     */
    public static InternetService getInstance(String key) {
        return SpiLoader.getInstance(InternetService.class, key);
    }

}