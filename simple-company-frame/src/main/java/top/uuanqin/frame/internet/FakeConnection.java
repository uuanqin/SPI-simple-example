package top.uuanqin.frame.internet;

import top.uuanqin.InternetService;

/**
 * @author uuanqin
 */
public class FakeConnection implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("你没有插网线！");
    }
}
