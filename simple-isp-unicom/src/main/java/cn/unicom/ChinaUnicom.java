package cn.unicom;

import top.uuanqin.InternetService;

public class ChinaUnicom implements InternetService {

    @Override
    public void connectInternet() {
        System.out.println("【中国联通】欢迎使用中国联通的无线上网服务！");
    }
}
