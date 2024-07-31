package cn.mobile;

import top.uuanqin.InternetService;

/**
 * @author uuanqin
 */
public class SuzhouMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("【中国移动（苏州移动）】欢迎使用中国移动联网服务！");
    }
}
