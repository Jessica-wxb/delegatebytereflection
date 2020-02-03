package DesignMode.BuilderPattern.proxyPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 8:50
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission = (AbstractPermission) new PermissionProxy();
        permission.modifyNote();
        permission.modifyUserInfo();
        permission.publishNote();
        permission.viewNote();
        System.out.println("============================1=================");
        permission.setLevel(1);
        permission.viewNote();
        permission.publishNote();
        permission.modifyUserInfo();
        permission.modifyNote();
    }
}
