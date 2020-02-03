package DesignMode.BuilderPattern.decoratorOne;

/**
 * @ClassName AirPlane
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:19
 * @Version 1.0
 **/
public class AirPlane extends Changer {
    public AirPlane(Transform transform) {
        super(transform);
        System.out.println("变成了飞机");
    }
    public void fly() {
        System.out.println("会飞翔");
    }
}
