package DesignMode.BuilderPattern.decoratorPattern;

/**
 * @ClassName Robot
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 8:48
 * @Version 1.0
 **/
public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
        System.out.println("变形金刚变成了机器人");
    }
    public void say() {
        System.out.println("会说话！");

    }

}

