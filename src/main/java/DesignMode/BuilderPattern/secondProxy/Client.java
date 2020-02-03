package DesignMode.BuilderPattern.secondProxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 9:13
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission = (AbstractPermission) new ProxyPermission();
        permission.modifyNote();
        permission.modifyUserInfo();
        permission.publishNote();
        permission.viewNote();
        System.out.println("================================");
        permission.setLevel(1);
        permission.modifyNote();
        permission.modifyUserInfo();
        permission.publishNote();
        permission.viewNote();
    }
}
