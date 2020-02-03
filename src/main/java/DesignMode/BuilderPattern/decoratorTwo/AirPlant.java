package DesignMode.BuilderPattern.decoratorTwo;

/**
 * @ClassName AirPlant
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:54
 * @Version 1.0
 **/
public class AirPlant extends  Changer {
    public AirPlant(Transform transform) {
        super(transform);
        System.out.println("一辆飞机");
    }
    public void fly() {
        System.out.println("在天上飞");
    }
}

