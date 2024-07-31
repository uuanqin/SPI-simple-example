package top.uuanqin;

/**
 * @author uuanqin
 */
public class TempConnection implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("公司A说：临时连接一下");
    }
}
