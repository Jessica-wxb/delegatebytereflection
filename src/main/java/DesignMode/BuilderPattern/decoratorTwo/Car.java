package DesignMode.BuilderPattern.decoratorTwo;

/**
 * @ClassName Car
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:51
 * @Version 1.0
 **/
public final class Car implements Transform {
    @Override
    public void move() {
        System.out.println("陆地上有移动");
    }

    public Car() {
        System.out.println("变形一辆汽车");
    }
}
