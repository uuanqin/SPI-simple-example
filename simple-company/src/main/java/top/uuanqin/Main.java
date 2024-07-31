package top.uuanqin;

import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
//        ServiceLoader<InternetService> loader = ServiceLoader.load(InternetService.class);
//        for(InternetService provider: loader){
//            provider.connectInternet();
//        }
        MyServiceLoader<InternetService> loader = MyServiceLoader.load(InternetService.class);
//        List<InternetService> providers = loader.getProviders();
        for (InternetService provider : loader){
            provider.connectInternet();
        }
    }
}
