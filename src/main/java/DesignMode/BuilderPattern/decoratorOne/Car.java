package DesignMode.BuilderPattern.decoratorOne;

/**
 * @ClassName Car
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:14
 * @Version 1.0
 **/
public final class Car implements Transform  {
    @Override
    public void move() {
        System.out.println("汽车在移动");
    }

    public Car() {
        System.out.println("变形金刚是一辆汽车");
    }
}
