package DesignMode.BuilderPattern.proxyPattern;

/**
 * @ClassName AbstractPermission
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 8:50
 * @Version 1.0
 **/
public interface AbstractPermission {
    void modifyUserInfo();

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);
}
