package DesignMode.BuilderPattern.behavioralPattern.observerPattern;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 16:36
 * @Version 1.0
 **/
public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("狗跟着叫！");
    }
}
