package DesignMode.BuilderPattern.decoratorPattern;

/**
 * @ClassName Car
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 8:48
 * @Version 1.0
 **/
public class Car implements Transform {
    @Override
    public void move() {
        System.out.println("在陆地上跑");
    }

    public Car() {
        System.out.println("变形金刚是一辆汽车");
    }
}
