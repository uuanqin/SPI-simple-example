package top.uuanqin;

public class SingletonIoDH {

    private static class HolderClass{
        private final static SingletonIoDH instance = new SingletonIoDH();
    }
    private SingletonIoDH(){
        System.out.println("生成了一个实例。");
    }

    public static SingletonIoDH getInstance() {
        return HolderClass.instance;
    }

}
