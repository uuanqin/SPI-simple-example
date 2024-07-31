package top.uuanqin;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start");
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(" ====== ");
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Stop.");
        System.out.println(singleton1==singleton2);
    }

// 结果
/*
Start
生成了一个实例。
======
Stop.
true
*/




}