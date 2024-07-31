package top.uuanqin.frame.internet;

import top.uuanqin.InternetService;

/**
 * @author uuanqin
 */
public class LocalConnection implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("访问 127.0.0.1 ......");
    }
}
