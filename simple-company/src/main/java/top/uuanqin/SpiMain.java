package top.uuanqin;

import top.uuanqin.frame.internet.InternetServiceFactory;

public class SpiMain {
    public static void main(String[] args) {
        InternetService internetService = InternetServiceFactory.getInstance("local");
        internetService.connectInternet();
    }
}
