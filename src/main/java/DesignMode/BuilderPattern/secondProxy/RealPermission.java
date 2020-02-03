package DesignMode.BuilderPattern.secondProxy;

/**
 * @ClassName RealPermission
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 9:14
 * @Version 1.0
 **/
public class RealPermission implements AbstractPermission {
    @Override
    public void publishNote() {
        System.out.println("发布新帖！");
    }

    @Override
    public void viewNote() {

    }

    @Override
    public void modifyNote() {
        System.out.println("修改帖子的内容！");

    }

    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息！");

    }

    @Override
    public void setLevel(int level) {

    }
}
