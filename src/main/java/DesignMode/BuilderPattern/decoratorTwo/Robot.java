package DesignMode.BuilderPattern.decoratorTwo;

/**
 * @ClassName Robot
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:53
 * @Version 1.0
 **/
public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
        System.out.println("变形机器人");
    }
    public void say() {
        System.out.println("说话");
    }
}
